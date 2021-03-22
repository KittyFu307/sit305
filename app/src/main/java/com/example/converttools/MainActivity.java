package com.example.converttools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewC;
    TextView textViewF;
    TextView textViewI;
    EditText input;
    final Double foot = 3.2808399;
    final Double inch = 39.3700787;
    final Double ounce = 35.2739619;
    final Double pounds = 2.20462262;
    final Double kelvin = 274.15;
    final Double fahrenheit = 33.8;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewC = findViewById(R.id.Text1);
        textViewF = findViewById(R.id.Text2);
        textViewI = findViewById(R.id.Text3);
        input = findViewById(R.id.editText1);
        spinner = findViewById(R.id.spinner);

    }
    public void changeMetre(View view){
        String item = spinner.getSelectedItem().toString();
        if("metre".equals(item)){
            Double result1 = Double.parseDouble(input.getText().toString()) * 100;
            String resulta = String.format("%.2f",result1);
            Double result2 = Double.parseDouble(input.getText().toString()) * foot;
            String resultb = String.format("%.2f",result2);
            Double result3 = Double.parseDouble(input.getText().toString()) * inch;
            String resultc = String.format("%.2f",result3);
            textViewC.setText(resulta + " " + getResources().getString(R.string.MeterCentimetre));
            textViewF.setText(resultb+" " + getResources().getString(R.string.MeterFoot));
            textViewI.setText(resultc+" " + getResources().getString(R.string.MeterInch));
        }else {
            Toast.makeText(MainActivity.this,"Please select the correct conversion icon",Toast.LENGTH_SHORT).show();
        }

    }

    public void changeCelsius(View view){
        String item = spinner.getSelectedItem().toString();
        if("celsius".equals(item)){
            Double result2 = Double.parseDouble(input.getText().toString()) * fahrenheit;
            String resultb = String.format("%.2f",result2);
            Double result3 = Double.parseDouble(input.getText().toString()) * kelvin;
            String resultc = String.format("%.2f",result3);
            textViewC.setText(resultb + " " + getResources().getString(R.string.CelsiusFahrenheit));
            textViewF.setText(resultc + " " + getResources().getString(R.string.CelsiusKelvin));
            textViewI.setText(null);
        }else {
            Toast.makeText(MainActivity.this,"Please select the correct conversion icon",Toast.LENGTH_SHORT).show();
        }
    }
    public void changeKilogram(View view){
        String item = spinner.getSelectedItem().toString();
        if("Kilograms".equals(item)){
            Double result1 = Double.parseDouble(input.getText().toString()) * 1000;
            String resulta = String.format("%.2f",result1);
            Double result2 = Double.parseDouble(input.getText().toString()) * ounce ;
            String resultb = String.format("%.2f",result2);
            Double result3 = Double.parseDouble(input.getText().toString()) * pounds;
            String resultc = String.format("%.2f",result3);
            textViewC.setText(resulta+ " " + getResources().getString(R.string.KilogramsGram));
            textViewF.setText(resultb+ " " + getResources().getString(R.string.KilogramsOunce));
            textViewI.setText(resultc+ " " + getResources().getString(R.string.KilogramsPound));
        }else {
            Toast.makeText(MainActivity.this,"Please select the correct conversion icon",Toast.LENGTH_SHORT).show();
        }
    }


}