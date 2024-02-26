package com.example.multi_convertor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity
{
    EditText e1;
    RadioButton r1,r2,r3,r4,r5;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = findViewById(R.id.data);
        t1 = findViewById(R.id.dataRes);

        r1 = findViewById(R.id.rb1);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                double val = Integer.parseInt(String.valueOf(e1.getText()));

                double kb = val/1024;
                double mb = val/(1024*1024);
                double gb = val/(1024*1024*1024);
                double tb = val/(1024*1024*1024*1024);

                String result = "KB: " + kb + "\nMB: " + mb + "\nGB: " + gb + "\nTB: " + tb;
                t1.setText(result);
            }
        });

        r2 = findViewById(R.id.rb2);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                double val = Integer.parseInt(String.valueOf(e1.getText()));

                double b = val*1024;
                double mb = val/(1024);
                double gb = val/(1024*1024);
                double tb = val/(1024*1024*1024);

                String result = "B: " + b + "\nMB: " + mb + "\nGB: " + gb + "\nTB: " + tb;
                t1.setText(result);
            }
        });

        r3 = findViewById(R.id.rb3);
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                double val = Integer.parseInt(String.valueOf(e1.getText()));

                double b = val*1024*1024;
                double kb = val*(1024);
                double gb = val/(1024);
                double tb = val/(1024*1024);

                String result = "B: " + b + "\nKB: " + kb + "\nGB: " + gb + "\nTB: " + tb;
                t1.setText(result);
            }
        });

        r4 = findViewById(R.id.rb4);
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                double val = Integer.parseInt(String.valueOf(e1.getText()));

                double b = val*1024*1024*1024;
                double kb = val*(1024*1024);
                double mb = val*(1024);
                double tb = val/(1024);

                String result = "B: " + b + "\nKB: " + kb + "\nMB: " + mb + "\nTB: " + tb;
                t1.setText(result);
            }
        });

        r5 = findViewById(R.id.rb5);
        r5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                double val = Integer.parseInt(String.valueOf(e1.getText()));

                double b = val*1024*1024*1024*1024;
                double kb = val*(1024*1024*1024);
                double mb = val*(1024*1024);
                double gb = val*(1024);

                String result = "B: " + b + "\nKB: " + kb + "\nMB: " + mb + "\nGB: " + gb;
                t1.setText(result);
            }
        });
    }
}