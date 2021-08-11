package com.example.miwok;

import android.app.Activity;
import android.media.Image;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;
    private  int mediaId;
    private MediaPlayer mediaPlayer;
    WordAdapter(Activity context, ArrayList<Word> words, int color) {

        super(context,0,words);
        mColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        //get the{@link word} object located at this position in the list
        Word currentWord = getItem(position);

        listItemView.setBackgroundColor(mColor);

        //find the text view in the list_item.xml layout with the id miwok
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        //get the version from the current word object and set this text in miwok translation
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);


        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColor);
        // Set the background color of the text container View
        textContainer.setBackgroundResource(mColor);



        return listItemView;
    }
}

