package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaemin on 17. 1. 15.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private int mColorResourceId;
    public WordAdapter(Activity context, ArrayList<Word> objects, Integer mColorResourceId) {
        super(context, 0, objects);
        this.mColorResourceId = mColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        Word currentAndroidFlavor = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_icon);
        if(currentAndroidFlavor.hasImage()){
            //set the ImageView
            imageView.setImageResource(currentAndroidFlavor.getImageResource());
            imageView.setVisibility(View.VISIBLE);
        } else {
            //otherwise, hide ImageView
            imageView.setVisibility(View.GONE);
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.defaultWord);
        nameTextView.setText(currentAndroidFlavor.getDefaultTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.translated);
        numberTextView.setText(currentAndroidFlavor.getmMiworkTranslation());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}
