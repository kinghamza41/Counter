package com.hamza.developingcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btnCounter,btnReset;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.txt1);
        btnCounter=(Button)findViewById(R.id.btn1);
        btnReset=(Button)findViewById(R.id.btn2);
       btnCounter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               counter++;
               tv.setText("Your Counter is: "+counter);
           }
       });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                tv.setText("Your Counter is: "+counter);
            }
        });
    }
}
