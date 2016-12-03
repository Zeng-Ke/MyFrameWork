package framework.zk.com.myframework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.Logger;

import framework.zk.com.myframework.base.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log();
    }


    public void log() {
        LogUtils.d("sdsdsdsd");
    }

}
