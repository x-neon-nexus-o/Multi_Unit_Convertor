package com.example.multi_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText e1;
    RadioButton r1,r2,r3,r4;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        e1 = findViewById(R.id.length);
        t1 = findViewById(R.id.lengthRes);

        r1 = findViewById(R.id.rb1);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val=Integer.parseInt(String.valueOf(e1.getText()));

                double cm=(val/10);
                double m=(val/1000);
                double km=(val/1000000);

                String result = "CM: " + cm + "\nM: " + m + "\nKM: " + km;
                t1.setText(result);
            }
        });

        r2 = findViewById(R.id.rb2);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val=Integer.parseInt(String.valueOf(e1.getText()));

                double mm=(val*10);
                double m=(val/100);
                double km=(val/100000);

                String result = "MM: " + mm + "\nM: " + m + "\nKM: " + km;
                t1.setText(result);
            }
        });

        r3 = findViewById(R.id.rb3);
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val=Integer.parseInt(String.valueOf(e1.getText()));

                double mm=(val*1000);
                double cm=(val*100);
                double km=(val/1000);

                String result = "MM: " + mm + "\nCM: " + cm + "\nKM: " + km;
                t1.setText(result);
            }
        });

        r4 = findViewById(R.id.rb4);
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val=Integer.parseInt(String.valueOf(e1.getText()));

                double mm=(val*1000000);
                double cm=(val*100000);
                double m=(val*1000);

                String result = "MM: " + mm + "\nCM: " + cm + "\nM: " + m;
                t1.setText(result);
            }
        });


    }
}