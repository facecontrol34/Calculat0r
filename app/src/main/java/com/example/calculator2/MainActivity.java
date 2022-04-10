package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText1;
    Integer numberOne = 0;
    Integer numberTwo = 0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, MainActivity2.class);
        intent.putExtra("numberOne", numberOne);
        intent.putExtra("numberTwo", numberTwo);
        editText = findViewById(R.id.editTextTextPersonName);
        editText1 = findViewById(R.id.editTextTextPersonName2);
    }

    public void onClickSum(View view){
        try {
            numberOne = Integer.parseInt(editText.getText().toString());
            numberTwo = Integer.parseInt(editText1.getText().toString());
            intent.putExtra("numberOne", numberOne);
            intent.putExtra("numberTwo", numberTwo);
            startActivity(intent);
        }
        catch (Exception ex){
            Toast.makeText(this, "Ошибка ввода", Toast.LENGTH_LONG).show();
        }
    }
}