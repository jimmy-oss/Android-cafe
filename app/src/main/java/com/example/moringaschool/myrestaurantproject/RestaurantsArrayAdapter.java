package com.example.moringaschool.myrestaurantproject;

import android.content.Context;
import android.widget.ArrayAdapter;

public class RestaurantsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRestaurants;
    private String[] mCategories;

    public RestaurantsArrayAdapter(Context mContext, int resource, String[] mRestaurants, String[] mCategories) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mRestaurants = mRestaurants;
        this.mCategories = mCategories;
    }


    @Override
    public Object getItem(int position) {
        String restaurant = mRestaurants[position];
        String category = mCategories[position];
        return String.format("%s \nServes great at: %s", restaurant, category);
    }

    @Override
    public int getCount() {
        return mRestaurants.length;
    }
}