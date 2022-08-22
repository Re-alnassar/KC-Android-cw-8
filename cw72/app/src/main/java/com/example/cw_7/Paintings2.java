package com.example.cw_7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

class Paintings2 extends ArrayAdapter {

List<Paintings> paintingsList;

    public Paintings2(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        paintingsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.xml2,parent,false);

        Paintings currentPainting = paintingsList.get(position);

        TextView paintingName = view.findViewById(R.id.paintingName);
        ImageView paintingImage = view.findViewById(R.id.imageView);
        TextView paintingPrice = view.findViewById(R.id.paintingPrice);


        paintingName.setText(currentPainting.getPaintingName());
        paintingImage.setImageResource(currentPainting.getPaintingImage());
        paintingPrice.setText(String.valueOf(currentPainting.getPaintingPrice()));


        ImageView dbutton = view.findViewById(R.id.dbutton);
        dbutton.setOnClickListener(new View.OnClickListener() {
            Paintings removedPainting = paintingsList.get(position);
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("Are you sure you want to delete that?")
                        .setTitle("Confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                paintingsList.remove(removedPainting);
                                notifyDataSetChanged();

                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                builder.show();
            }
        });

        return view;
    }

}
