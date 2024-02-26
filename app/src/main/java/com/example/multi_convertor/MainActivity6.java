package com.example.multi_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    EditText e1;
    RadioButton r1,r2,r3;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        e1 = findViewById(R.id.temp);
        t1 = findViewById(R.id.tempres);

        r1=findViewById(R.id.rb1);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val=Integer.parseInt(String.valueOf(e1.getText()));

                double f =(val * 9/5) + 32;
                double k = val + 273.15;

                String result = "F: " + f + "\nK: " + k;
                t1.setText(result);

            }
        });

        r2=findViewById(R.id.rb2);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val=Integer.parseInt(String.valueOf(e1.getText()));

                double c =(val - 32) * 5/9;
                double k = val + 273.15;

                String result = "C: " + c + "\nK: " + k;
                t1.setText(result);

            }
        });

        r3=findViewById(R.id.rb3);
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val=Integer.parseInt(String.valueOf(e1.getText()));

                double c =val - 273.15;
                double f = (val * 9/5) - 459.67;

                String result = "C: " + c + "\nF: " + f;
                t1.setText(result);

            }
        });
    }
}