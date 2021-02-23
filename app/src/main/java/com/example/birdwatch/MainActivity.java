package com.example.birdwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.birdwatch.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private int count1=0;
    private int count2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set buttons to increment or decrement count
        Button addButton = findViewById(R.id.addButton);
        Button addButton2 = findViewById(R.id.addButton2);
        Button subtButton = findViewById(R.id.subtButton);
        Button subtButton2 = findViewById(R.id.subtButton2);
        TextView counter1 = (TextView) findViewById(R.id.counter1);
        TextView counter2 = (TextView) findViewById(R.id.counter2);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1 ++;
                if(count1 < 0)
                {
                    count1=0;
                }
                counter1.setText(Integer.toString(count1));
            }
        });
        addButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2 ++;
                if(count2 < 0)
                {
                    count2=0;
                }
                counter2.setText(Integer.toString(count2));
            }
        });
        subtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1 --;
                if(count1 < 0)
                {
                    count1=0;
                }
                counter1.setText(Integer.toString(count1));
            }
        });
        subtButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2 --;
                if(count2 < 0)
                {
                    count2=0;
                }
                counter2.setText(Integer.toString(count2));
            }
        });


        // Create two Spinners to allow the user to select birds to count
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.birds_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);
    }
}