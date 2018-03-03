package com.example.android.mysimplecalculartor;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Create four button objects
    Button addButton , minusButton , divButton , mulButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connect the four button objects to their views
        addButton = (Button) findViewById(R.id.additionButton);
        minusButton = (Button)findViewById(R.id.minusButton);
        divButton = (Button)findViewById(R.id.divisionBitton);
        mulButton = (Button) findViewById(R.id.multiplicationButton);

        //OnClickListener for the AdditionActivity
        View.OnClickListener addTwoNumber = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goToSum = new Intent(MainActivity.this,AdditionActivity.class);
                startActivity(goToSum);
            }
        };

        //OnClickListener for the SubstractionActivity
        View.OnClickListener subTwoNumber = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSubstract = new Intent(MainActivity.this,SubstractionActivity.class
                );
                startActivity(goToSubstract);
            }
        };

        //OnClickListener for the DivisionActivity
        View.OnClickListener divTwoNumber =new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDivision = new Intent(MainActivity.this,DivisionActivity.class);
                startActivity(goToDivision);
            }
        };

        //OnClickListener for the MultiplicationActivity
        View.OnClickListener mulTwoNumber = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMultiplication = new Intent(MainActivity.this,MultiplicationActivity.class);
                startActivity(goToMultiplication);
            }
        };

        addButton.setOnClickListener(addTwoNumber);
        minusButton.setOnClickListener(subTwoNumber);
        mulButton.setOnClickListener(mulTwoNumber);
        divButton.setOnClickListener(divTwoNumber);
    }
}
