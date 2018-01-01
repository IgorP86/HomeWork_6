package com.igorr.homework_3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by Igorr on 30.12.2017.
 */

public class Contacts extends AppCompatActivity {
    ArrayList<Person> personArrayList;
    RecyclerView recyclerView;

    // @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);

        //Заполнение списка
        for (int i = 0; i != 20; i++) {
            personArrayList.add(new Person("Анонимус" + i, "12234565", 1));
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        PersonAdapter adapter = new PersonAdapter();
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);


    }
}
