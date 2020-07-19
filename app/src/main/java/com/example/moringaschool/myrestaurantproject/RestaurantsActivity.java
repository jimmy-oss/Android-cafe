package com.example.moringaschool.myrestaurantproject;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RestaurantsActivity extends AppCompatActivity {
    private String[] restaurants = new String[] {"Moneyheist season 4", "The witcher",
            "Harry potter", "The matrix", "Chucky", "Annabelle",
            "Lucifer season 5", "The flash season 8", "The Undergrounds", "Hanna",
             "Kung fu Panda", "The impastor",
            "The Exorcist"};
    private String[] categories = new String[] {"duration=4hrs","duration=4hrs","duration=2hrs","duration=2hrs",
            "duration=3hrs","duration=1hrs","duration=3hrs","duration=2hrs","duration=4hrs","duration=2hrs","durations=3hrs",
            "duration=2hrs","duration=2hrs","duration=3hrs"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ListView mListView = (ListView) findViewById(R.id.listView);
        TextView mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        RestaurantsArrayAdapter adapter = new RestaurantsArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants,categories);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(RestaurantsActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here you can choose your favourite movie and series enjoy!!: " + location);
    }
}