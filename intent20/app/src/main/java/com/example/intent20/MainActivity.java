package com.example.intent20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(btn1);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(btn2);
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(btn3);
    }
    private View.OnClickListener btn1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0987654321"));
                startActivity(intent);

            }

        };
    private View.OnClickListener btn2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri = Uri.parse("http://youtu.be/mjLDn2Kh2Sk");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
         }
        };
    private View.OnClickListener btn3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent map = new Intent(Intent.ACTION_VIEW);
            startActivity(map);
        }
    };

}



