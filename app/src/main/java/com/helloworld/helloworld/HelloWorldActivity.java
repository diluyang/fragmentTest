package com.helloworld.helloworld;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * 因为Android Studio新建Activity是自动继承AppCompatActivity，所以我也没有改成
 * Activity，这个和本案例没有关系哈。
 */
public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // requestWindowFeature(Window.FEATURE_NO_TITLE);
        //因为继承的是AppCompatActivity，所以requestWindowFeature()失效了
        getSupportActionBar().hide();
        setContentView(R.layout.hello_world_layout);

    }
}