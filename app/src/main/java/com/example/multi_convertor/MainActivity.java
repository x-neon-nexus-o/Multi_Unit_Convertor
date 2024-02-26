package com.example.multi_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openData();
            }

        });

        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openLength();
            }

        });

        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openMass();
            }

        });

        b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openNumerical();
            }

        });

        b5 = findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openTemperature();
            }

        });

        b6 = findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openTime();
            }

        });
    }
    public void openData()
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void openLength()
    {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void openMass()
    {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void openNumerical()
    {
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
    public void openTemperature()
    {
        Intent intent = new Intent(this,MainActivity6.class);
        startActivity(intent);
    }
    public void openTime()
    {
        Intent intent = new Intent(this,MainActivity7.class);
        startActivity(intent);
    }
}