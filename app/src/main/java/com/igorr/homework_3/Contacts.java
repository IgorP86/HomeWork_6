package com.igorr.homework_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Igorr on 30.12.2017.
 */

public class Contacts extends AppCompatActivity {
    private ArrayList<Person> personArrayList = new ArrayList<>();
    public RecyclerView contactsView;

    // @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        contactsView = findViewById(R.id.contacts_view);

        //Автозаполнение списка контактов
        listInit();
        //creates an adapter
        PersonAdapter adapter = new PersonAdapter(this, this.personArrayList);
        //attaches the adapter to the RecyclerView
        contactsView.setAdapter(adapter);

    }

    private void listInit() {
        for (int i = 0; i != 20; i++) {
            personArrayList.add(new Person("Игорь Александрович " + i, Person.generateRandTel(), R.mipmap.ic_google_foreground));
        }
    }
}
