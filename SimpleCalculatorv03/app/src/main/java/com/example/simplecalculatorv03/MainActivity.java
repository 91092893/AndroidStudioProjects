package com.example.simplecalculatorv03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView topOutput;
TextView midOutput;
TextView answerOutput;
TextView sum;
ImageButton add;
ImageButton minus;
ImageButton divide;
ImageButton multi;
int select;

double firstint;
double secondint;
String int1;
String int2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerOutput = findViewById(R.id.tv_answer_num_output);
        topOutput = findViewById(R.id.tv_top_num_output);
        ImageButton num0 = findViewById(R.id.ib_num0);
        ImageButton num1 = findViewById(R.id.ib_num1);
        ImageButton num2 = findViewById(R.id.ib_num2);
        ImageButton num3 = findViewById(R.id.ib_num3);
        ImageButton num4 = findViewById(R.id.ib_num4);
        ImageButton num5 = findViewById(R.id.ib_num5);
        ImageButton num6 = findViewById(R.id.ib_num6);
        ImageButton num7 = findViewById(R.id.ib_num7);
        ImageButton num8 = findViewById(R.id.ib_num8);
        ImageButton num9 = findViewById(R.id.ib_num9);

        add = findViewById(R.id.ib_plus);
        minus = findViewById(R.id.ib_minus);
        multi = findViewById(R.id.ib_multi);
        divide = findViewById(R.id.ib_divison);

        ImageButton Anum0 = findViewById(R.id.ib_Anum0);
        ImageButton Anum1 = findViewById(R.id.ib_Anum1);
        ImageButton Anum2 = findViewById(R.id.ib_Anum2);
        ImageButton Anum3 = findViewById(R.id.ib_Anum3);
        ImageButton Anum4 = findViewById(R.id.ib_Anum4);
        ImageButton Anum5 = findViewById(R.id.ib_Anum5);
        ImageButton Anum6 = findViewById(R.id.ib_Anum6);
        ImageButton Anum7 = findViewById(R.id.ib_Anum7);
        ImageButton Anum8 = findViewById(R.id.ib_Anum8);
        ImageButton Anum9 = findViewById(R.id.ib_Anum9);

        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        Anum0.setOnClickListener(this);
        Anum1.setOnClickListener(this);
        Anum2.setOnClickListener(this);
        Anum3.setOnClickListener(this);
        Anum4.setOnClickListener(this);
        Anum5.setOnClickListener(this);
        Anum6.setOnClickListener(this);
        Anum7.setOnClickListener(this);
        Anum8.setOnClickListener(this);
        Anum9.setOnClickListener(this);
        add.setOnClickListener(this);
        minus.setOnClickListener(this);
        multi.setOnClickListener(this);
        divide.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        if(v.getId() == R.id.ib_num0)
        {
            topOutput.setText("0");
            firstint = 0;
        }
        if(v.getId() == R.id.ib_num1)
        {
            topOutput.setText("1");
            firstint = 1;
        }
        if(v.getId() == R.id.ib_num2)
        {
            topOutput.setText("2");
            firstint = 2;
        }
        if(v.getId() == R.id.ib_num3)
        {
            topOutput.setText("3");
            firstint = 3;
        }
        if(v.getId() == R.id.ib_num4)
        {
            topOutput.setText("4");
            firstint = 4;
        }
        if(v.getId() == R.id.ib_num5)
        {
            topOutput.setText("5");
            firstint = 5;
        }
        if(v.getId() == R.id.ib_num6)
        {
            topOutput.setText("6");
            firstint = 6;
        }
        if(v.getId() == R.id.ib_num7)
        {
            topOutput.setText("7");
            firstint = 7;
        }
        if(v.getId() == R.id.ib_num8)
        {
            topOutput.setText("8");
            firstint = 8;
        }
        if(v.getId() == R.id.ib_num9)
        {
            topOutput.setText("9");
            firstint = 9;
        }
        if(v.getId() == R.id.ib_Anum0)
        {
            midOutput.setText("0");
            secondint = 0;
        }
        if(v.getId() == R.id.ib_Anum1)
        {
            midOutput.setText("1");
            secondint = 1;
        }
        if(v.getId() == R.id.ib_Anum2)
        {
            midOutput.setText("2");
            secondint = 2;
        }
        if(v.getId() == R.id.ib_Anum3)
        {
            midOutput.setText("3");
            secondint = 3;
        }
        if(v.getId() == R.id.ib_Anum4)
        {
            midOutput.setText("4");
            secondint = 4;
        }
        if(v.getId() == R.id.ib_Anum5)
        {
            midOutput.setText("5");
            secondint = 5;
        }
        if(v.getId() == R.id.ib_Anum6)
        {
            midOutput.setText("6");
            secondint = 6;
        }
        if(v.getId() == R.id.ib_Anum7)
        {
            midOutput.setText("7");
            secondint = 7;
        }
        if(v.getId() == R.id.ib_Anum8)
        {
            midOutput.setText("8");
            secondint = 8;
        }
        if(v.getId() == R.id.ib_Anum9)
        {
            midOutput.setText("9");
            secondint = 9;
        }
        else if(v.getId() == R.id.ib_plus)
        {
            select = 1;
            add.setBackgroundColor(Color.BLUE);
        }

    }
}
