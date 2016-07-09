package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelloWorldActivity extends AppCompatActivity {


    TextView tv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);

        // change the text
        tv = (TextView) findViewById(R.id.hello_text);
        tv.setText("Hello my name is Jasmit");

    }

    protected void onButtonClick(View view) {

        Toast.makeText(getBaseContext(), "Button has been clicked",Toast.LENGTH_SHORT).show();

        if (tv !=null) {
            tv.setTextSize(40);
            tv.setTextColor(getResources().getColor(R.color.myCustomColor));
        }

    }



}
