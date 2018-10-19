package com.example.osimodel;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView) findViewById(R.id.textViewTitle);
        title.setText(Html.fromHtml(getString(R.string.Title)));
        title.setTypeface(null, Typeface.BOLD);

        TextView intro = (TextView) findViewById(R.id.textViewIntroduction);
        intro.setText(Html.fromHtml(getString(R.string.Introduction)));

        TextView body = (TextView) findViewById(R.id.textViewBody);
        body.setText(Html.fromHtml(getString(R.string.Body)));

        YoutubeFragment fragment = new YoutubeFragment();

        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .addToBackStack(null)
                .commit();

        TextView body2 = (TextView) findViewById(R.id.textViewBody2);
        body2.setText(Html.fromHtml(getString(R.string.Body2)));
    }
}

