package com.example.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.data_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
     private ActivityMainBinding activityMainBinding;
     private MyClickHandler myClickHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p1 = new Person("jack","jack@gmail.com");

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setPerson(p1);

        myClickHandler= new MyClickHandler(this);
        activityMainBinding.setOnclick(myClickHandler);


    }








}