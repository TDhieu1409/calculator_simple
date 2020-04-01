package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnResult,btnAdd,btnSub,btnMulti,btnDivision,btnCE,btnC,btnBS,btnDot,btnN_P;
    TextView tvInput, tvOutput;
    String process, tmp = "";

    double ans = 0, preAns = 0, num = 0;
    int calculation = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.editZero);
        btn1 = findViewById(R.id.edit1);
        btn2 = findViewById(R.id.edit2);
        btn3 = findViewById(R.id.edit3);
        btn4 = findViewById(R.id.edit4);
        btn5 = findViewById(R.id.edit5);
        btn6 = findViewById(R.id.edit6);
        btn7 = findViewById(R.id.edit7);
        btn8 = findViewById(R.id.edit8);
        btn9 = findViewById(R.id.edit9);
        btnDot = findViewById(R.id.editDot);
        btnN_P = findViewById(R.id.editN_P);

        btnAdd = findViewById(R.id.editAdd);
        btnSub = findViewById(R.id.editSub);
        btnMulti = findViewById(R.id.editMulti);
        btnDivision = findViewById(R.id.editDivision);

        btnResult = findViewById(R.id.editResult);

        btnCE = findViewById(R.id.editCE);
        btnC = findViewById(R.id.editC);
        btnBS = findViewById(R.id.editBS);

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "0");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "0");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "0");
                    }
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "1");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "1");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "1");
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "2");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "2");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "2");
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "3");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "3");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "3");
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "4");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "4");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "4");
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "5");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "5");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "5");
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "6");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "6");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "6");
                    }
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "7");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "7");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "7");
                    }
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "8");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "8");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "8");
                    }
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    process = tvOutput.getText().toString();
                    tvOutput.setText(process + "9");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();
                    if (check[length-1] == '='){
                        tvOutput.setText("");
                        tvInput.setText("");
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "9");
                    } else {
                        process = tvOutput.getText().toString();
                        tvOutput.setText(process + "9");
                    }
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
                preAns = 0;
                ans = 0;
                tmp = "";
                tvInput.setText("");
                tvOutput.setHint("0");
            }
        });

        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = tvOutput.getText().length();
                int number = tvOutput.getText().length() - 1;
                String store;

                if (length > 0){
                    StringBuilder back = new StringBuilder(tvOutput.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    tvOutput.setText(store);
                }
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    ans = Double.parseDouble((String) tvOutput.getText());
                    tvInput.setText(tvOutput.getText().toString() + "+");
                    calculation = 1;
                    tvOutput.setText("");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();

                    if (check[length-1] == '+'){
                        String[] Array = tvInput.getText().toString().split("\\+");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns + Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "+");
                        calculation = 1;
                        tvOutput.setText("");
                    } else if(check[length-1] == '-'){
                        String[] Array = tvInput.getText().toString().split("-");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns - Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "+");
                        calculation = 1;
                        tvOutput.setText("");
                    } else if(check[length-1] == '*'){
                        String[] Array = tvInput.getText().toString().split("\\*");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns * Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "+");
                        calculation = 1;
                        tvOutput.setText("");
                    } else if(check[length-1] == '/'){
                        String[] Array = tvInput.getText().toString().split("/");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns / Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "+");
                        calculation = 1;
                        tvOutput.setText("");
                    } else if(check[length-1] == '='){
                        ans = Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(tvOutput.getText().toString() + "+");
                        calculation = 1;
                        tvOutput.setText("");
                    }
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    ans = Double.parseDouble((String) tvOutput.getText());
                    tvInput.setText(tvOutput.getText().toString() + "-");
                    calculation = 2;
                    tvOutput.setText("");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();

                    if (check[length-1] == '+'){
                        String[] Array = tvInput.getText().toString().split("\\+");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns + Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "-");
                        calculation = 2;
                        tvOutput.setText("");
                    } else if(check[length-1] == '-'){
                        String[] Array = tvInput.getText().toString().split("-");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns - Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "-");
                        calculation = 2;
                        tvOutput.setText("");
                    } else if(check[length-1] == '*'){
                        String[] Array = tvInput.getText().toString().split("\\*");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns * Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "-");
                        calculation = 2;
                        tvOutput.setText("");
                    } else if(check[length-1] == '/'){
                        String[] Array = tvInput.getText().toString().split("/");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns / Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "-");
                        calculation = 2;
                        tvOutput.setText("");
                    } else if(check[length-1] == '='){
                        ans = Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(tvOutput.getText().toString() + "-");
                        calculation = 2;
                        tvOutput.setText("");
                    }
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tvInput.getText().length() == 0){
                    ans = Double.parseDouble((String) tvOutput.getText());
                    tvInput.setText(tvOutput.getText().toString() + "*");
                    calculation = 3;
                    tvOutput.setText("");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();

                    if (check[length-1] == '+'){
                        String[] Array = tvInput.getText().toString().split("\\+");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns + Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "*");
                        calculation = 3;
                        tvOutput.setText("");
                    } else if(check[length-1] == '-'){
                        String[] Array = tvInput.getText().toString().split("-");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns - Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "*");
                        calculation = 3;
                        tvOutput.setText("");
                    } else if(check[length-1] == '*'){
                        String[] Array = tvInput.getText().toString().split("\\*");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns * Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "-");
                        calculation = 3;
                        tvOutput.setText("");
                    } else if(check[length-1] == '/'){
                        String[] Array = tvInput.getText().toString().split("/");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns / Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "*");
                        calculation = 3;
                        tvOutput.setText("");
                    } else if(check[length-1] == '='){
                        ans = Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(tvOutput.getText().toString() + "*");
                        calculation = 3;
                        tvOutput.setText("");
                    }
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() == 0){
                    ans = Double.parseDouble((String) tvOutput.getText());
                    tvInput.setText(tvOutput.getText().toString() + "/");
                    calculation = 4;
                    tvOutput.setText("");
                } else {
                    char[] check = tvInput.getText().toString().toCharArray();
                    int length = tvInput.getText().length();

                    if (check[length-1] == '+'){
                        String[] Array = tvInput.getText().toString().split("\\+");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns + Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "/");
                        calculation = 4;
                        tvOutput.setText("");
                    } else if(check[length-1] == '-'){
                        String[] Array = tvInput.getText().toString().split("-");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns - Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "/");
                        calculation = 4;
                        tvOutput.setText("");
                    } else if(check[length-1] == '*'){
                        String[] Array = tvInput.getText().toString().split("\\*");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns * Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "/");
                        calculation = 4;
                        tvOutput.setText("");
                    } else if(check[length-1] == '/'){
                        String[] Array = tvInput.getText().toString().split("/");
                        preAns = Double.parseDouble(Array[0]);
                        ans = preAns / Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(Double.toString(ans) + "/");
                        calculation = 4;
                        tvOutput.setText("");
                    } else if(check[length-1] == '='){
                        ans = Double.parseDouble((String) tvOutput.getText());
                        tvInput.setText(tvOutput.getText().toString() + "/");
                        calculation = 4;
                        tvOutput.setText("");
                    }
                }
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char[] check = tvInput.getText().toString().toCharArray();
                int length = tvInput.getText().length();
                if (check[length-1] == '='){
                    tvInput.setText(tvOutput.getText().toString() + "=");
                } else {
                    tmp = String.copyValueOf(tvInput.getText().toString().toCharArray());
                    tvInput.setText(tmp + tvOutput.getText().toString() + "=");
                    arithmetic_operation();
                    tvOutput.setText(Double.toString(ans));
                }
            }
        });
    }

    public void arithmetic_operation(){
        switch(calculation ){
            case 1: //Addition
                ans = ans + Double.parseDouble((String) tvOutput.getText());
                break;
            case 2: //Subtraction
                ans = ans- Double.parseDouble((String) tvOutput.getText());
                break;

            case 3: //Multiplication
                ans = ans * Double.parseDouble((String) tvOutput.getText());
                break;

            case 4: //Division
                ans = ans / Double.parseDouble((String) tvOutput.getText());
                break;

        }
    }

}

