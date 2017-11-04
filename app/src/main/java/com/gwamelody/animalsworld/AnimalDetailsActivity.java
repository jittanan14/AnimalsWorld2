package com.gwamelody.animalsworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.gwamelody.animalsworld.model.Animal;

public class AnimalDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        ImageView animalImageView = (ImageView) findViewById(R.id.animal_image_view);
        TextView detailTextView = (TextView) findViewById(R.id.detail_text_view);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        AnimalData animalData = AnimalData.getInstance();
        Animal animal = animalData.animalList.get(position);

        detailTextView.setText(animal.detail);
        animalImageView.setImageResource(animal.picture);

        getSupportActionBar().setTitle(animal.name);
    }
}
