package com.exam.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_layout);
    }
    public void onMyButtonClick(View view)
    {
        // вивід повідомлення при натистенні
        Toast.makeText(this, "Ви натиснули на кнопку", Toast.LENGTH_SHORT).show();
    }

}