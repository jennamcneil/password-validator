package com.example.jen.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = (EditText) findViewById(R.id.editText);
        final Button button = (Button) findViewById(R.id.button);
        final TextView output= (TextView) findViewById(R.id.textView);
        final passwordValidator check=new passwordValidator();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                passwordValidator check = new passwordValidator();
                check.setWord(input.getText().toString());
                if (check.validate1(check.getWord())>=3) {
                    output.setText(check.getWord() + "! Your password is strong enough");
                    if(check.validate2(check.getWord())>=3){
                        output.setText(check.getWord() + "! Your password is strong enough,howver could be stronger." +
                                "\nInclude both letter cases and add symbols & numbers");
                    }
                }
                else
                    output.setText(check.getWord()+"! Your password is too weak");
            }

        });
    }
}
