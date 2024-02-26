package com.example.multi_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    EditText e1;
    RadioButton r1,r2,r3,r4;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        e1 = findViewById(R.id.numerical);
        t1 = findViewById(R.id.numericalres);

        r1=findViewById(R.id.rb1);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int val = Integer.parseInt(String.valueOf(e1.getText()));

                String bin=Integer.toBinaryString(val);
                String oct=Integer.toOctalString(val);
                String hex=Integer.toHexString(val);

                String result = "BIN: " + bin + "\nOCT: " + oct + "\nHEX: " + hex;
                t1.setText(result);
            }
        });

        r2=findViewById(R.id.rb2);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int val = Integer.parseInt(String.valueOf(e1.getText()));

                String dec= String.valueOf(val);
                String oct=Integer.toOctalString(val);
                String hex=Integer.toHexString(val);

                String result = "DEC: " + dec + "\nOCT: " + oct + "\nHEX: " + hex;
                t1.setText(result);
            }
        });

        r3=findViewById(R.id.rb3);
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int val = Integer.parseInt(String.valueOf(e1.getText()));

                String dec= String.valueOf(val);
                String bin=Integer.toBinaryString(val);
                String hex=Integer.toHexString(val);

                String result = "DEC: " + dec + "\nBIN: " + bin + "\nHEX: " + hex;
                t1.setText(result);
            }
        });

        r4=findViewById(R.id.rb4);
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int val = Integer.parseInt(String.valueOf(e1.getText()));

                String dec= String.valueOf(val);
                String bin=Integer.toOctalString(val);
                String oct=Integer.toHexString(val);

                String result = "DEC: " + dec + "\nBIN: " + bin + "\nOCT: " + oct;
                t1.setText(result);
            }
        });
    }
}