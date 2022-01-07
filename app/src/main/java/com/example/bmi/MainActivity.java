package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button cal;
    EditText wt,ht;
    TextView rs1,rs2;

    float weight,height,result;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cal = findViewById(R.id.btncal);
        wt  = findViewById(R.id.weight);
        ht  = findViewById(R.id.height);
        rs1 = findViewById(R.id.result);
        rs2 = findViewById(R.id.result2);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                weight = Float.parseFloat(wt.getText().toString());
                height = Float.parseFloat(ht.getText().toString());

                result = weight/(height*height);

                rs1.setText(String.valueOf(result));


                if (result>=25){
                    rs2.setText("Fat");
                }
                else if (result<18){
                    rs2.setText("Thin");
                }
                else {
                    rs2.setText("Normal");
                }



            }
        });

    }
}