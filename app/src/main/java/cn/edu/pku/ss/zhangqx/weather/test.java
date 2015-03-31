package cn.edu.pku.ss.zhangqx.weather;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 露阳 on 2015/3/26.
 */
public class test extends Activity{
    private TextView tvv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        tvv = (TextView)findViewById(R.id.tv2);

    }
}
