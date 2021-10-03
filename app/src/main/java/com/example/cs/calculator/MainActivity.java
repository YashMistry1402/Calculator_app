package com.example.cs.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tffirst,tfsecond,result;
    Button add,sub,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tffirst=(TextView)findViewById(R.id.tffirst);
        tfsecond=(TextView)findViewById(R.id.tfsecond);
        result=(TextView)findViewById(R.id.result);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        div=(Button)findViewById(R.id.div);
        mul=(Button)findViewById(R.id.mul);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1,n2,n3;
                n1=Double.parseDouble(tffirst.getText().toString());
                n2=Double.parseDouble(tfsecond.getText().toString());
                n3=n1+n2;
                result.setText(String.valueOf(n3));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1,n2,n3;
                n1=Double.parseDouble(tffirst.getText().toString());
                n2=Double.parseDouble(tfsecond.getText().toString());
                n3=n1-n2;
                result.setText(String.valueOf(n3));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1,n2,n3;
                n1=Double.parseDouble(tffirst.getText().toString());
                n2=Double.parseDouble(tfsecond.getText().toString());
                n3=n1/n2;
                result.setText(String.valueOf(n3));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1,n2,n3;
                n1=Double.parseDouble(tffirst.getText().toString());
                n2=Double.parseDouble(tfsecond.getText().toString());
                n3=n1*n2;
                result.setText(String.valueOf(n3));

            }
        });
    }

}
