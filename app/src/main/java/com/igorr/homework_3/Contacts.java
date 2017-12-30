package com.igorr.homework_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Igorr on 30.12.2017.
 */

public class Contacts extends AppCompatActivity {
    // @Override
    protected void onCreate (Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
