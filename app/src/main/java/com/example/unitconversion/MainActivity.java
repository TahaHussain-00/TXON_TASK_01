package com.example.unitconversion;

import static com.example.unitconversion.R.id.AnsValues;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring The Widgets
    EditText editText;
    TextView textView,textView2,textView4,AnsValues;
    Button button, button2, button3,button4;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //instantiating the widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        AnsValues = findViewById(R.id.AnsValues);

        editText = findViewById(R.id.editTextNumber);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        //Adding a click event for button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling convert to kilo to pounds method

                CovertFromKiloToPound();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling convert from kilo to grams

                ConvertFromKilotoGrams();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling Convert from kilo to tonne

                ConvertFromkilotoTonne();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling Convert From Kilo yo Quintal

                ConvertFromKilotoQuintal();
            }
        });




    }

    private void CovertFromKiloToPound() {
        //This method will convert kilo to pound

        String valueEnteredinKilo = editText.getText().toString();

        //converting string to number
        double Kilo = Double.parseDouble(valueEnteredinKilo);

        //converting kilo to pounds Formula
        double pounds  = Kilo * 2.205;

        //Displaying
        AnsValues.setText("" + pounds);


    }
    private void ConvertFromKilotoGrams() {

        //this method will convert Kilo to grams

        String ValueEnteredinkilo = editText.getText().toString();

        //converting String to number
        double Kilo = Double.parseDouble(ValueEnteredinkilo);

        //converting kilo to Grams
        double grams = Kilo * 1000;

        //display
        AnsValues.setText(""+grams);



    }

    private void ConvertFromkilotoTonne() {
        //This Method will convert Kilo to Tonne

        String ValueEnteredinKilo = editText.getText().toString();

        //Converting String to Number
        double Kilo = Double.parseDouble(ValueEnteredinKilo);

        //Converting kilo to Tonne
        double Tonne = Kilo/1000;

        //Display
        AnsValues.setText("" + Tonne);
    }


    private void ConvertFromKilotoQuintal() {
        //This Method Will Convert Kilo To Quintal

        String ValueEnteredInQuintal = editText.getText().toString();

        //Converting String to Number
        double Kilo = Double.parseDouble(ValueEnteredInQuintal);

        //Contering Kilo To Quintal
        double Quintal = Kilo/100;

        //Display
        AnsValues.setText("" + Quintal);
    }

}