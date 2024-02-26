package com.example.multi_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    EditText e1;
    RadioButton r1,r2,r3,r4;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        e1 = findViewById(R.id.mass);
        t1 = findViewById(R.id.massres);

        r1 = findViewById(R.id.rb1);
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val = Integer.parseInt(String.valueOf(e1.getText()));

                double g = val/1000;
                double kg = val/(1000000);
                double t = val/(1000000000);

                String result = "G: " + g + "\nKG: " + kg + "\nT: " + t;
                t1.setText(result);
            }
        });

        r2 = findViewById(R.id.rb2);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val = Integer.parseInt(String.valueOf(e1.getText()));

                double mg = val*1000;
                double kg = val/(1000);
                double t = val/(1000000);

                String result = "MG: " + mg + "\nKG: " + kg + "\nT: " + t;
                t1.setText(result);
            }
        });

        r3 = findViewById(R.id.rb3);
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val = Integer.parseInt(String.valueOf(e1.getText()));

                double mg = val*1000000;
                double g = val*(1000);
                double t = val/(1000);

                String result = "MG: " + mg + "\nG: " + g + "\nT: " + t;
                t1.setText(result);
            }
        });

        r4 = findViewById(R.id.rb4);
        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double val = Integer.parseInt(String.valueOf(e1.getText()));

                double mg = val*1000000000;
                double g = val*(1000000);
                double kg = val*(1000);

                String result = "MG: " + mg + "\nG: " + g + "\nKG: " + kg;
                t1.setText(result);
            }
        });
    }
}