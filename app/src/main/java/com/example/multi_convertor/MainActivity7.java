package com.example.multi_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    EditText e1;
    RadioButton r1,r2,r3,r4,r5;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        e1 = findViewById(R.id.time);
        t1 = findViewById(R.id.timeres);

        r1=findViewById(R.id.rb1);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double value=Integer.parseInt(String.valueOf(e1.getText()));

                double milliseconds = value / 1000;
                double s = milliseconds / 1000;
                double min = s / 60;
                double h = min / 60;

                String result = "MS: " + milliseconds + "\nS: " +s+"\nMIN: " + min+"\nH: " + h ;
                t1.setText(result);
            }
        });

        r2=findViewById(R.id.rb2);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double value=Integer.parseInt(String.valueOf(e1.getText()));

                double microseconds = value * 1000;
                double s = value / 1000;
                double min = s / 60;
                double h = min / 60;

                String result = "MS(MICRO): " + microseconds + "\nS: " +s+"\nMIN: " + min+"\nH: " + h ;
                t1.setText(result);
            }
        });

        r3=findViewById(R.id.rb3);
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double value=Integer.parseInt(String.valueOf(e1.getText()));

                double microseconds = value * 1000000;
                double  milliseconds = value * 1000;
                double min = value / 60;
                double h = min / 60;

                String result = "MS(MICRO): " + microseconds + "\nMS(MILLI): " +milliseconds+"\nMIN: " + min+"\nH: " + h ;
                t1.setText(result);
            }
        });

        r4=findViewById(R.id.rb4);
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double value=Integer.parseInt(String.valueOf(e1.getText()));

               double microseconds = value * 60000000;
               double milliseconds = value * 60000;
                double s = value * 60;
                double h= value / 60;

                String result = "MS(MICRO): " + microseconds + "\nMS(MILLI): " +milliseconds+"\nS: " + s+"\nH: " + h ;
                t1.setText(result);
            }
        });

        r5=findViewById(R.id.rb5);
        r5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double value=Integer.parseInt(String.valueOf(e1.getText()));

                double microseconds = value * (360000000*10);
                double milliseconds = value * 3600000;
                double s = value * 3600;
                double min = value * 60;

                String result = "MS(MICRO): " + microseconds + "\nMS(MILLI): " +milliseconds+"\nS: " + s+"\nMIN: " + min ;
                t1.setText(result);
            }
        });
    }
}