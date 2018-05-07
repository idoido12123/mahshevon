package com.example.idoid.mahshevon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button cefel, hiluk, hibur, minus, shave, ac, credit;
    EditText edi1;
    double num1 = 0, num2;
    String st1, st2;
    char ch1;
    int sum;
    int another;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cefel = (Button) findViewById(R.id.cefel);
        hiluk = (Button) findViewById(R.id.hiluk);
        hibur = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        shave = (Button) findViewById(R.id.shave);
        ac = (Button) findViewById(R.id.clear);
        credit = (Button) findViewById(R.id.credit);
        edi1 = (EditText) findViewById(R.id.edi1);
    }

    void cefel(View view) {
        sum = sum + 1;
        if (sum == 1) {
            st1 = edi1.getText().toString();
            num1 = Double.parseDouble(st1);
        } else if (ch1 == '*')
        {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 * num2;
        }
        else if (ch1 == ':') {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 / num2;
        }
        else if(ch1=='+'){
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 + num2;
        }
        else {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 - num2;
        }
        edi1.setText("");
        edi1.setHint("" + num1);
        ch1='*';
    }

    void hiluk(View view) {
        sum = sum + 1;
        if (sum == 1) {
            st1 = edi1.getText().toString();
            num1 = Double.parseDouble(st1);
        } else if (ch1 == '*')
            {
                st2 = edi1.getText().toString();
                num2 = Double.parseDouble(st2);
                num1 = num1 * num2;
            }
            else if (ch1 == ':') {
                st2 = edi1.getText().toString();
                num2 = Double.parseDouble(st2);
                num1 = num1 / num2;
            }
            else if(ch1=='+'){
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 + num2;
        }
        else {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 - num2;
        }
            edi1.setText("");
            edi1.setHint("" + num1);
            ch1 = ':';
        }


    void hibur(View view) {
        sum = sum + 1;
        if (sum == 1) {
            st1 = edi1.getText().toString();
            num1 = Double.parseDouble(st1);
        } else if (ch1 == '*')
        {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 * num2;
        }
        else if (ch1 == ':') {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 / num2;
        }
        else if(ch1=='+'){
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 + num2;
        }
        else {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 - num2;
        }
        edi1.setText("");
        edi1.setHint("" + num1);
        ch1='+';
    }

    void minus(View view) {
        sum = sum + 1;
        if (sum == 1) {
            st1 = edi1.getText().toString();
            num1 = Double.parseDouble(st1);
        } else if (ch1 == '*')
        {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 * num2;
        }
        else if (ch1 == ':') {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 / num2;
        }
        else if(ch1=='+'){
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 + num2;
        }
        else {
            st2 = edi1.getText().toString();
            num2 = Double.parseDouble(st2);
            num1 = num1 - num2;
        }
        edi1.setText("");
        edi1.setHint("" + num1);
        ch1='-';
    }


    void shave(View view) {
        if (ch1 == '*') {
            st1 = edi1.getText().toString();
            num2 = Double.parseDouble(st1);
            num1 = num1 * num2;
            edi1.setText("" + num1);
            sum = 0;
        } else {
            if (ch1 == ':') {
                st1 = edi1.getText().toString();
                num2 = Double.parseDouble(st1);
                num1 = num1 / num2;
                edi1.setText("" + num1);
                sum = 0;
            } else if (ch1 == '+') {
                st1 = edi1.getText().toString();
                num2 = Double.parseDouble(st1);
                num1 = num1 + num2;
                edi1.setText("" + num1);
                sum = 0;
            } else if (ch1 == '-') {
                st1 = edi1.getText().toString();
                num2 = Double.parseDouble(st1);
                num1 = num1 - num2;
                edi1.setText("" + num1);
                sum = 0;
            }

        }
    }

    void clear(View view) {
        num1 = 0;
        sum = 0;
        edi1.setText("");
        edi1.setHint("enter a number");
    }

    void credits(View view) {
        Intent t = new Intent(this, credits.class);
            st1 = Double.toString(num1);
            t.putExtra("ido", st1);
            startActivity(t);

    }
}

