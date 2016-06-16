package com.example.ganesha.spider_inductions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle sname = getIntent().getExtras();
        String studentname = sname.getString("studentname");
        final TextView Message = (TextView) findViewById(R.id.Message);
        Message.setText(studentname);
    }
    public void back(View view){
        Intent a = new Intent(this,MainActivity.class);
        startActivity(a);

    }
}
