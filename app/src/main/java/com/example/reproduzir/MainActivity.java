package com.example.reproduzir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void proximaTela(View view){

            Intent intent = new Intent(this, SegundaActivity.class);
            startActivity(intent);
        }
    }
}
