package cn.lettin.lettinv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.lettin.liblettin.LettinNetwork;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.tv);

        LettinNetwork ln = new LettinNetwork();
        tv.setText(ln.stringFromJNI()+" lebo Version:"+ln.getGwVersion());
    }
}
