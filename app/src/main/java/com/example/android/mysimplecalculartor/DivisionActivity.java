package com.example.android.mysimplecalculartor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DivisionActivity extends AppCompatActivity {
    //create view Objects to later connect them to their actual views in the layout
    EditText value1EditText, value2EditText;
    Button equalButton;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        //connect the view object to their actual views in the layout
        value1EditText = findViewById(R.id.value1_edit_view);
        value2EditText = findViewById(R.id.value2_edit_view);
        equalButton = findViewById(R.id.equalButton);
        result = findViewById(R.id.result_edit_view);
        //create OnClickListener object to hold the click on each view
        View.OnClickListener performDivision = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create variables to hold the user values and onr for the result
                int value1 , value2 ,showResult;
                //check if the user has enter two values
                if (value1EditText.getText().toString() != null && value2EditText.getText().toString() != null) {
                    value1 = Integer.parseInt(value1EditText.getText().toString());
                    value2 = Integer.parseInt(value2EditText.getText().toString());
                    //check if the user has just enter 0 value in the second editView
                    if(value1 != 0 && value2 == 0){
                        showResult = 0;
                        result.setText("Invalid Operation please don't enter 0 as a second value ");
                    }
                    //check if the user has just enter 0 value in the first editView
                    else if(value1 == 0 && value2 != 0){
                        showResult = 0;
                        result.setText("0 over any number gives  " + showResult);
                    }
                    showResult = division(value1, value2);
                    result.setText("your result is " + showResult);
                 }
                else if(value1EditText.getText().toString() != null && value2EditText.getText().toString() == null) {

                    value1 = Integer.parseInt(value1EditText.getText().toString());
                    value2 = 0;
                    showResult = 0;
                    result.setText("please enter a number in the second field ");

                }
                //check if the user has just enter one value in the second editView
                else if(value1EditText.getText().toString() == null && value2EditText.getText().toString() != null) {

                    value1 = 0;
                    value2 = Integer.parseInt(value2EditText.getText().toString());
                    showResult = 0;
                    result.setText("please enter a number in the first field ");

                }
                // if the user has not enter any values
                else {
                    showResult = value2 = value1 = 0 ;
                    result.setText("Please enter two numbers and try again");
                }
            }
        };
        equalButton.setOnClickListener(performDivision);
    }
    public int division(int number1, int number2) {
        return number1 / number2;
    }
}
