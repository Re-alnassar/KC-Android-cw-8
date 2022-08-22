package com.example.cw_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {


    int r = 0;
    ArrayList<Paintings> paintings = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Paintings p1 = new Paintings("Girl with a pearl earring", R.drawable.girl,1500);
        Paintings p2 = new Paintings("Monalisa",R.drawable.lisa,1300);
        Paintings p3 = new Paintings("Starry night",R.drawable.starry,1200);

        paintings.add(p1);
        paintings.add(p2);
        paintings.add(p3);





        Paintings2 paintings2  = new Paintings2(this,0,paintings);

        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(paintings2);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Paintings currentPainting = paintings.get(i);

        Intent intent = new Intent(MainActivity.this, Paintings3.class);
        intent.putExtra("Paintings", currentPainting);

        startActivity(intent);


    }
});


    }
}