package com.example.ganesha.spider_inductions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.Department,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
    }
  public void onClick(View view){
      Intent i= new Intent(this,Main2Activity.class);
      final EditText nameinput = (EditText)findViewById(R.id.nameinput);
      final EditText rollno = (EditText)findViewById(R.id.rollno);
      String name = nameinput.getText().toString();
      String roll = rollno.getText().toString();
      if (name.matches("")){
          Toast.makeText(getApplicationContext(),"Please fill your name",Toast.LENGTH_LONG).show();
      }
      else if(roll.matches("")){
          Toast.makeText(getApplicationContext(),"Please fill your rollno",Toast.LENGTH_LONG).show();
      }
      else{
      i.putExtra("studentname",name);
      startActivity(i);
  }}
}

