package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelloWorldActivity extends AppCompatActivity {


    TextView tv = null;
    private final static String TAG = HelloWorldActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);

        // change the text using a string defined in the strings.xml
        tv = (TextView) findViewById(R.id.hello_text);

        if (tv!=null) {
            tv.setText(getString(R.string.alt_text));
        }

        Log.d(TAG,"string value has been changed");

        //on button click it will display message with Toast
        myButton.setOnclickListener(new View.onClickListener(){
            public voide onClick(View view){
                Toast.makeText(getBaseContext(), "this was clicked!", Toast.LENGTH_LONG)
            }
        })



    }

    protected void onButtonClick(View view) {

        Log.d(TAG,"onButtonClick()");


        Toast.makeText(getBaseContext(), "Button has been clicked",Toast.LENGTH_SHORT).show();

        if (tv !=null) {
            tv.setTextSize(40);
            tv.setTextColor(getResources().getColor(R.color.myCustomColor));
        }

    }



}
