package com.ren.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counterTextView1, counterTextView2, counterTextView3;
    private Button incrementButton1, incrementButton2, incrementButton3;
    private Button decrementButton1, decrementButton2, decrementButton3;

    private int count1 = 0, count2 = 0, count3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connecting textviews and buttons
        counterTextView1 = findViewById(R.id.counterTextView1);
        counterTextView2 = findViewById(R.id.counterTextView2);
        counterTextView3 = findViewById(R.id.counterTextView3);

        incrementButton1 = findViewById(R.id.incrementButton1);
        incrementButton2 = findViewById(R.id.incrementButton2);
        incrementButton3 = findViewById(R.id.incrementButton3);

        decrementButton1 = findViewById(R.id.decrementButton1);
        decrementButton2 = findViewById(R.id.decrementButton2);
        decrementButton3 = findViewById(R.id.decrementButton3);

        // clicking events defination
        incrementButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                counterTextView1.setText(String.valueOf(count1));
            }
        });

        incrementButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2++;
                counterTextView2.setText(String.valueOf(count2));
            }
        });

        incrementButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3++;
                counterTextView3.setText(String.valueOf(count3));
            }
        });

        decrementButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count1 > 0) {
                    count1--;
                    counterTextView1.setText(String.valueOf(count1));
                }
            }
        });

        decrementButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count2 > 0) {
                    count2--;
                    counterTextView2.setText(String.valueOf(count2));
                }
            }
        });

        decrementButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count3 > 0) {
                    count3--;
                    counterTextView3.setText(String.valueOf(count3));
                }
            }
        });
    }
}
