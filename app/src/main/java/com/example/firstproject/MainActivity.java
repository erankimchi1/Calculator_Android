package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button buttonOne;
    int num1=0, num2=0;
    String sign = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textViewResult);
        buttonOne = findViewById(R.id.buttonOne);
    }


    public void AddNumberFunction(View view) {
        if (view instanceof Button){
            Button button = (Button) view;
            String str = button.getText().toString();
            if (Integer.parseInt(result.getText().toString()) == 0)
                result.setText(str);
            else
                result.append(str);
        }
    }

    public void EqualFunction(View view) {
        if (view instanceof Button) {
            String temp2 = result.getText().toString();
            num2 = Integer.parseInt(temp2);
            int res=0;
            switch (sign) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "X":
                    res = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0)
                       res = num1 / num2;
                    else
                        System.out.println("Error Cant divide by 0");
                    break;
                default:
                    break;

            }
            num1 = res;
            result.setText((res)+"");
        }
    }

    public void PlusFunction(View view) {
        if (view instanceof Button){
            String temp1 = result.getText().toString();
            num1 = Integer.parseInt(temp1);
            sign = "+";
            result.setText("0");
        }
    }

    public void MinusFunction(View view) {
        if (view instanceof Button) {
            String temp1 = result.getText().toString();
            num1 = Integer.parseInt(temp1);
            sign = "-";
            result.setText("0");
        }
    }

    public void MulFunction(View view) {
        if (view instanceof Button) {
            String temp1 = result.getText().toString();
            num1 = Integer.parseInt(temp1);
            sign = "X";
            result.setText("0");
        }
    }

    public void DivideFunction(View view) {
        if (view instanceof Button) {
            String temp1 = result.getText().toString();
            num1 = Integer.parseInt(temp1);
            sign = "/";
            result.setText("0");
        }

    }

    public void ClearFunction(View view) {
        result.setText("0");
    }
}