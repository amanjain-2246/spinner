package com.example.amanj.spinner;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.operating_system,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
 public void onItemSelected(AdapterView<?> parent,View view,int pos,long id)
    {parent.getItemAtPosition(pos).toString();
        switch (pos) {
            case 0:
                Intent intent = new Intent(this, Android.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, Windows.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, Mac.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, Linux.class);
                startActivity(intent3);
                break;
            default:
                break;
        }

      /*

        String item=parent.getItemAtPosition(pos).toString();
        Toast.makeText(parent.getContext(),"Selected:"+item,Toast.LENGTH_LONG).show();*/
    }
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}

