package com.example.cw_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Paintings3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);super.onCreate(savedInstanceState);


        Bundle bundle = getIntent().getExtras();

        Paintings deliveredPainting = (Paintings) bundle.getSerializable("Paintings");

        TextView name = findViewById(R.id.name);
        ImageView imageView2 = findViewById(R.id.imageView2);
        TextView price = findViewById(R.id.price);

        name.setText(deliveredPainting.getPaintingName());
        imageView2.setImageResource(deliveredPainting.getPaintingImage());
        price.setText(String.valueOf(deliveredPainting.getPaintingPrice()));


    }
}
