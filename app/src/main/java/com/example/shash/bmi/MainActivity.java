package com.example.shash.bmi;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText weight;
EditText height;
Button compute;
float bm;
TextView BMI;
TextView Verdict;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        compute=findViewById(R.id.button);
        BMI=findViewById(R.id.bmi);
        Verdict=findViewById(R.id.verdict);
        result=findViewById(R.id.help);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float w=Integer.parseInt(weight.getText().toString());
                float h=Integer.parseInt(height.getText().toString());
                float i;

                bm=((w*10000)/(h*h));
                BMI.setText(String.valueOf(bm));
                if(bm<19){
                    Verdict.setText("Underweight");
                     i=((19*h*h)/10000)-w;
                     result.setText(String.valueOf(i)+" kg to be gained");

                }
                if(bm>=19&&bm<=24){
                    Verdict.setText("Normal");
                    result.setText("Keep it up!");
                    }
                if(bm>24) {
                    i = w - ((24 * h * h) / 10000);

                    if (bm > 24 || bm <= 29) {
                        Verdict.setText("Overweight");
                    }
                    if (bm > 29) {
                        Verdict.setText("Obese");
                    }
                    result.setText(String.valueOf(i)+" kg to be lost");
                }


            }
        });




    }
}
