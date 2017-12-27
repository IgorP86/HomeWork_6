package com.igorr.homework_3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    @Override
    protected void onStart(){
        super.onStart();
            //Явный интент
            Intent intent = new Intent(this, confirmActivity.class);
          //  startActivity(intent);

            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com"));
//          startActivity(intent2);
    }
}
