package com.example.allenwu.mygithubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
public static final String TAG="Mainactivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //this is small chaange

    }
    public void showNumberLogcat(View view){
        doMathstuff();
    }

    private  void doMathstuff(){
//In logcat ,  Level: Debug
        int a=10;
        int b=20;
        int total=a+b;
        Log.d(TAG,"sum---"+total);
    }
}
