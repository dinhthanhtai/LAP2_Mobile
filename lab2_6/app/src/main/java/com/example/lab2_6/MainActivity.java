package com.example.lab2_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Thumbnail> thumbnails;
    private ThumbnailAdapter thumbnailAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();
        Spinner spinnerThumb = findViewById(R.id.editThum       )   ;
        thumbnailAdapter =new ThumbnailAdapter(this,thumbnails);
        spinnerThumb.setAdapter(thumbnailAdapter);

//        spinnerThumb.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Thumbnail clickedItem = (Thumbnail)parent.getItemAtPosition(position);
//                String clickThumbName = clickedItem.getName();
//                Toast.makeText(MainActivity.this, clickThumbName + "selected",Toast.LENGTH_SHORT).show();
//            }
//        });


    }
    private void initList(){
        thumbnails = new ArrayList<>();
        thumbnails.add(new Thumbnail("Thumbnail 1", R.drawable.first_thumbnail));
        thumbnails.add(new Thumbnail("Thumbnail 2", R.drawable.second_thumbnail));
        thumbnails.add(new Thumbnail("Thumbnail 3", R.drawable.third_thumbnail));
        thumbnails.add(new Thumbnail("Thumbnail 4", R.drawable.fourth_thumbnail));
    }
}