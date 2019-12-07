package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mul extends AppCompatActivity {

    EditText et1,et2;
    TextView t1;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul);

        et1=(EditText)findViewById(R.id.a1);
        et2=(EditText)findViewById(R.id.a2);
        btn=(Button)findViewById(R.id.a3);
        t1=(TextView)findViewById(R.id.a4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(et1.getText().toString());
                int b=Integer.parseInt(et2.getText().toString());

                int c =a+b;

                t1.setText("Answer="+c);



            }
        });
    }
}
