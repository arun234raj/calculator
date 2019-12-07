package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sub extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        e1=(EditText)findViewById(R.id.ee2);
        e2=(EditText)findViewById(R.id.e2);
        btn=(Button)findViewById(R.id.b3);
        t1=(TextView)findViewById(R.id.t2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());

                int c =a-b;

                t1.setText("Answer="+c);



            }
        });
    }
}
