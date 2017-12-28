package com.igorr.homework_3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnContinue;
    Button btnRegistration;
    Button btnVk;
    Button btnFacebook;
    Button btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContinue = findViewById(R.id.btn_continue);
        btnRegistration = findViewById(R.id.btn_registration);
        btnVk = findViewById(R.id.btn_vk);
        btnFacebook = findViewById(R.id.btn_facebook);
        btnGoogle = findViewById(R.id.btn_google);

        final Intent smsConfirm = new Intent(this, confirmActivity.class);

        OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_continue: {
                        startActivity(smsConfirm);
                        break;
                    }
                    case R.id.btn_vk: {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com")));
                        break;
                    }
                    case R.id.btn_facebook: {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com")));
                        break;
                    }
                    case R.id.btn_google: {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com")));
                        break;
                    }
                    case R.id.btn_registration: {

                        break;
                    }
                }
            }
        };
        ActionMenuView actM = new ActionMenuView(this);
        btnContinue.setOnClickListener(onClickListener);
        btnRegistration.setOnClickListener(onClickListener);
        btnVk.setOnClickListener(onClickListener);
        btnFacebook.setOnClickListener(onClickListener);
        btnGoogle.setOnClickListener(onClickListener);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("aaa");
        return super.onCreateOptionsMenu(menu);
    }
}
