package com.example.basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText first_number;
    private EditText second_number;
    private TextView result;
    int num_1, num_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_number = findViewById(R.id.first_input);
        second_number = findViewById(R.id.second_input);
        result = findViewById(R.id.result_view);

    }

    public void add_numbers (View view) {

        StringBuilder sb1 = new StringBuilder(first_number.getText().toString());
        StringBuilder sb2 = new StringBuilder(second_number.getText().toString());

        num_1 =  Integer.parseInt(sb1.toString());
        num_2 = Integer.parseInt(sb2.toString());

        int num_result = num_1 + num_2;

        result.setText(Integer.toString(num_result));
    }

    public void subtract_number (View view) {

        StringBuilder sb1 = new StringBuilder(first_number.getText().toString());
        StringBuilder sb2 = new StringBuilder(second_number.getText().toString());

        num_1 =  Integer.parseInt(sb1.toString());
        num_2 = Integer.parseInt(sb2.toString());

        int num_result = num_1 - num_2;

        result.setText(Integer.toString(num_result));
    }

    public void multiply_number (View view) {

        StringBuilder sb1 = new StringBuilder(first_number.getText().toString());
        StringBuilder sb2 = new StringBuilder(second_number.getText().toString());

        num_1 =  Integer.parseInt(sb1.toString());
        num_2 = Integer.parseInt(sb2.toString());

        int num_result = num_1 * num_2;

        result.setText(Integer.toString(num_result));
    }

    public void divide_number (View view) {

        StringBuilder sb1 = new StringBuilder(first_number.getText().toString());
        StringBuilder sb2 = new StringBuilder(second_number.getText().toString());

        num_1 =  Integer.parseInt(sb1.toString());
        num_2 = Integer.parseInt(sb2.toString());

        double division = num_1 / (num_2 * 1.0) ;

        result.setText(String.format("%.2f", division));
    }

    public void clear_Numbers (View view) {
        first_number.getText().clear();
        second_number.getText().clear();

        result.setText("Press a button to show result!");
    }
}