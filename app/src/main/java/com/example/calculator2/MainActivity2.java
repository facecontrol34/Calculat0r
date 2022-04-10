package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle arguments = getIntent().getExtras();
        TextView textView2 = findViewById(R.id.textView);
        String numberOne;
        String numberTwo;
        Integer result = arguments.getInt("numberOne")+arguments.getInt("numberTwo");

        numberOne = arguments.get("numberOne").toString();

        if(arguments.getInt("numberTwo")<0){
            numberTwo = "("+arguments.get("numberTwo").toString()+")";
        }
        else {
            numberTwo = arguments.get("numberTwo").toString();
        }
        textView2.setText(numberOne+" + "+numberTwo+" = "+result);
    }
    public void onClickReturn(View view){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}