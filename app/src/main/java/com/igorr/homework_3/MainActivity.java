package com.igorr.homework_3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Button btnContinue;
    Button btnRegistration;
    Button btnVk;
    Button btnFacebook;
    Button btnGoogle;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.mainviev);
        btnContinue = findViewById(R.id.btn_continue);
        btnRegistration = findViewById(R.id.btn_registration);
        btnVk = findViewById(R.id.btn_vk);
        btnFacebook = findViewById(R.id.btn_facebook);
        btnGoogle = findViewById(R.id.btn_google);

        final Intent smsConfirm = new Intent(this, ConfirmActivity.class);
        final Intent testSctiv = new Intent(this, Contacts.class);

        final Snackbar snb1 = Snackbar.make(layout, "секретный код: 123456", Snackbar.LENGTH_INDEFINITE);
        final Snackbar snb2 = Snackbar.make(layout, "секретный код: 986542", 20000);

        final OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_continue: {
                        snb1.show();
                        //     startActivity(smsConfirm);
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
                        String code = ((Double) Math.random()).toString().substring(2, 5);

                        snb2.setDuration(10000);
                        snb2.setText("Проверочный код: " + code);
                        snb2.setAction("Перейти", new OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(testSctiv);
                            }
                        });
                        snb2.show();
                        break;
                    }
                }
            }
        };

        btnContinue.setOnClickListener(onClickListener);
        btnRegistration.setOnClickListener(onClickListener);
        btnVk.setOnClickListener(onClickListener);
        btnFacebook.setOnClickListener(onClickListener);
        btnGoogle.setOnClickListener(onClickListener);
    }
}
