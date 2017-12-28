package com.igorr.homework_3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Igorr on 25.12.2017.
 */

public class confirmActivity extends AppCompatActivity {
    CoordinatorLayout coordinatorLayout;
    TextView textView;

   // @Override
    protected void onCreate (Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView = findViewById(R.id.textView);

    }
}
