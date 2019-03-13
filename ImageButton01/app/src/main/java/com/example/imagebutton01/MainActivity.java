package com.example.imagebutton01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton stopSignButton = findViewById(R.id.ib_stopSign);
        ImageButton appleLogoButton = findViewById(R.id.ib_applelogo);
        ImageButton rightArrowButton = findViewById(R.id.ib_rightArrow);
        TextView clickableText = findViewById(R.id.tv_clickText);
        stopSignButton.setOnClickListener(this);
        appleLogoButton.setOnClickListener(this);
        rightArrowButton.setOnClickListener(this);
        clickableText.setOnClickListener(this);
    } //end of onCreate
    public void onClick(View view){
        if(view.getId() == R.id.ib_stopSign){
            Toast.makeText(this, "You clicked on a stop sign",
                    Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.ib_applelogo){
            Toast.makeText(this,"You clicked on the apple logo",
                    Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.ib_rightArrow){
            Toast.makeText(this, "You clicked on a right arrow",
                    Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.tv_clickText)
        {
            Toast.makeText(this, "Why are you click on words",
                    Toast.LENGTH_SHORT).show();
        }

    }
} //end of class
