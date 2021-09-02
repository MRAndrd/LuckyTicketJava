package com.example.luckyticketjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ticketText(View view) {
        EditText editText = (EditText) findViewById(R.id.ticketNumber);
        String ticketInput = editText.getText().toString();
        char[] item = ticketInput.toCharArray();
        ImageView bulbId = findViewById(R.id.bulbId);
        switch (item.length) {
            case 6:
                if ((item[0] + item[1] + item[2]) == (item[3] + item[4] + item[5])) {
                    bulbId.setImageResource(R.drawable.green);
                } else {
                    bulbId.setImageResource(R.drawable.red);
                }
                break;
            default:
                Toast.makeText(this, "Потрібно ввести 6 символів!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}