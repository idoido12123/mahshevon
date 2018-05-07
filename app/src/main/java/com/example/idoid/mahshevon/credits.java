package com.example.idoid.mahshevon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class credits extends AppCompatActivity {
    TextView tv1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        tv1=(TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.button);
        tv1.setText("Last result: "+getIntent().getExtras().getString("ido"));

    }
    void ret(View view){
        Intent t = new Intent(this, MainActivity.class);
        startActivity(t);

    }
}
