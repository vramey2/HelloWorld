package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) (findViewById(R.id.text));


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change color of the label
                textView.setTextColor(getResources().getColor(R.color.green));
            }
        });
        //change background by clicking on button
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

        //change text by clicking on button
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               textView.setText ("Android is Awesome!");
            }
        });

        //change back to default values when clicked on background
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello from Veronika!");
                textView.setTextColor(getResources().getColor(R.color.black) );
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.pink));

            }
        });

        //user clicks on change to custom text button to change the text from the text field
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text view to what is in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editTextButton)).getText().toString();
                //if the text field is empty update text with default string
                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userEnteredText);

                }
            }
        });
        }



}