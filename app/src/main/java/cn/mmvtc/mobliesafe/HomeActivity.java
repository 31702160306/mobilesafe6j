package cn.mmvtc.mobliesafe;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import cn.mmvtc.mobliesafe.chapter01.adapter.HomeAdapter;

public class HomeActivity extends Activity {
    private GridView gv_home;
    private long mExitTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去标题
        setContentView(R.layout.activity_home);
        gv_home = (GridView) findViewById(R.id.gv_home);
        gv_home.setAdapter(new HomeAdapter(HomeActivity.this));
        gv_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0://手机防盗

                        break;
                    case 1://

                        break;
                    case 2://

                        break;
                    case 3://

                        break;
                    case 4://

                        break;
                    case 5://

                        break;
                    case 6://

                        break;
                    case 7://

                        break;

                    case 8://

                        break;

                }


            }
        });

    }

    /**
     * 按两次退出程序
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            if ((System.currentTimeMillis() - mExitTime) < 2000) {
                System.exit(0);
            }else {
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                mExitTime=System.currentTimeMillis();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
