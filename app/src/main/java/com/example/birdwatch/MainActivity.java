package com.example.birdwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);


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
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                switch(pos){
                    case 0:
                        imageView.setImageResource(R.drawable.americanrobin);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.northerncardinal);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.bluejay);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.stellersjay);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.mourningdove);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.americancrow);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.europeanstarling);
                        break;
                    case 7:
                        imageView.setImageResource(R.drawable.northernmockingbird);
                        break;
                    case 8:
                        imageView.setImageResource(R.drawable.blackbilledmagpie);
                        break;
                    case 9:
                        imageView.setImageResource(R.drawable.darkeyedjunco);
                        break;
                    case 10:
                        imageView.setImageResource(R.drawable.blackcappedchickadee);
                        break;
                    case 11:
                        imageView.setImageResource(R.drawable.whitebreastednuthatch);
                        break;
                    case 12:
                        imageView.setImageResource(R.drawable.tuftedtitmouse);
                        break;
                    case 13:
                        imageView.setImageResource(R.drawable.housesparrow);
                        break;
                    case 14:
                        imageView.setImageResource(R.drawable.housewren);
                        break;
                    case 15:
                        imageView.setImageResource(R.drawable.housefinch);
                        break;
                    case 16:
                        imageView.setImageResource(R.drawable.americangoldfinch);
                        break;
                    case 17:
                        imageView.setImageResource(R.drawable.downywoodpecker);
                        break;
                    case 18:
                        imageView.setImageResource(R.drawable.hairywoodpecker);
                        break;
                    case 19:
                        imageView.setImageResource(R.drawable.redbelliedwoodpecker);
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                switch(pos){
                    case 0:
                        imageView2.setImageResource(R.drawable.americanrobin);
                        break;
                    case 1:
                        imageView2.setImageResource(R.drawable.northerncardinal);
                        break;
                    case 2:
                        imageView2.setImageResource(R.drawable.bluejay);
                        break;
                    case 3:
                        imageView2.setImageResource(R.drawable.stellersjay);
                        break;
                    case 4:
                        imageView2.setImageResource(R.drawable.mourningdove);
                        break;
                    case 5:
                        imageView2.setImageResource(R.drawable.americancrow);
                        break;
                    case 6:
                        imageView2.setImageResource(R.drawable.europeanstarling);
                        break;
                    case 7:
                        imageView2.setImageResource(R.drawable.northernmockingbird);
                        break;
                    case 8:
                        imageView2.setImageResource(R.drawable.blackbilledmagpie);
                        break;
                    case 9:
                        imageView2.setImageResource(R.drawable.darkeyedjunco);
                        break;
                    case 10:
                        imageView2.setImageResource(R.drawable.blackcappedchickadee);
                        break;
                    case 11:
                        imageView2.setImageResource(R.drawable.whitebreastednuthatch);
                        break;
                    case 12:
                        imageView2.setImageResource(R.drawable.tuftedtitmouse);
                        break;
                    case 13:
                        imageView2.setImageResource(R.drawable.housesparrow);
                        break;
                    case 14:
                        imageView2.setImageResource(R.drawable.housewren);
                        break;
                    case 15:
                        imageView2.setImageResource(R.drawable.housefinch);
                        break;
                    case 16:
                        imageView2.setImageResource(R.drawable.americangoldfinch);
                        break;
                    case 17:
                        imageView2.setImageResource(R.drawable.downywoodpecker);
                        break;
                    case 18:
                        imageView2.setImageResource(R.drawable.hairywoodpecker);
                        break;
                    case 19:
                        imageView2.setImageResource(R.drawable.redbelliedwoodpecker);
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

    }
}