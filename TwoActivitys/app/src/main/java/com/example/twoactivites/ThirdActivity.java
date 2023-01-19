package com.example.twoactivites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private TextView mTvCount;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mTvCount = findViewById(R.id.tv_count);

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt("count");
            mTvCount.setText(String.valueOf(mCount));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", mCount);
    }

    public void countUp(View view) {
        mTvCount.setText(String.valueOf(++mCount));
    }
}