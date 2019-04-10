package cn.mmvtc.mobliesafe.chapter02.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import cn.mmvtc.mobliesafe.R;


public class InterPasswordDialog extends Dialog implements
        View.OnClickListener{
    private TextView mTitleTV;//标题
    public EditText mFirstPWDET;//首次输入密码
    public EditText mAffirmET;//再次输入密码
    private MyCallBack myCallBack;

    public InterPasswordDialog(Context context) {
        super(context,R.style.dialog_custom);
    }
    public void setCallBack(MyCallBack myCallBack) {
        this.myCallBack = myCallBack;

    }

    //设置对话框标题
    public void setTitle(String text) {
        if (!TextUtils.isEmpty(text))
        {
            mTitleTV.setText(text);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inter_password_dialog);
        initView();
    }
    private void initView() {
        mTitleTV = (TextView) findViewById(R.id.tv_interpwd_title);
        mFirstPWDET = (EditText) findViewById(R.id.et_interpwd);
        

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ok:
                myCallBack.ok();
                break;
            case R.id.btn_cancle:
                myCallBack.cancle();
                break;
        }

    }

    public interface MyCallBack {
        void ok();

        void cancle();
    }
}
