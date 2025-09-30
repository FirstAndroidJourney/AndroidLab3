package com.example.androidlab3;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTraiCay = findViewById(R.id.listviewTraiCay);
        arrayTraiCay = new ArrayList<>();

        // Demo data
        arrayTraiCay.add(new TraiCay("Chuối tiêu",
                "Chuối tiêu Long An", R.drawable.ic_launcher_background));
        arrayTraiCay.add(new TraiCay("Thanh long",
                "Thanh long ruột đỏ", R.drawable.ic_launcher_foreground));

        adapter = new TraiCayAdapter(this, R.layout.dong_trai_cay, arrayTraiCay);
        lvTraiCay.setAdapter(adapter);
    }
}
