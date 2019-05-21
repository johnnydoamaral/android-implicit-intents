package com.johnny.implicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvJoke;
    private TextView tvJokeComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvJoke = findViewById(R.id.tv_joke);
        tvJokeComment = findViewById(R.id.tv_comment);
        String joke = getJokeFromIntent();
        if (joke != null && !joke.isEmpty()) {
            tvJoke.setText(joke);
            tvJokeComment.setText(getString(R.string.joke_comment));
        }
    }

    private String getJokeFromIntent() {
        return getIntent().getStringExtra(Intent.EXTRA_TEXT);
    }
}
