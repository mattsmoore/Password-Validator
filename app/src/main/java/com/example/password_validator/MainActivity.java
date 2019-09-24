package com.example.password_validator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.password_validator.Validator.basicValidator;
import static com.example.password_validator.Validator.complexValidator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                EditText pw = findViewById(R.id.pwInput);
                String password = pw.getText().toString();

                if(basicValidator(password) == 0 && complexValidator(password) == 0){
                    TextView textView = findViewById(R.id.message);
                    textView.setText("Complex Password");
                }
                else if(complexValidator(password) > 0 && basicValidator(password) == 0){
                    TextView textView = findViewById(R.id.message);
                    textView.setText("Basic Password");
                }
                else{
                    TextView textView = findViewById(R.id.message);
                    textView.setText("Password Not Strong");
                }
            }
        });

    }
}
