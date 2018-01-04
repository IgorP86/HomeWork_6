package com.igorr.homework_3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

//import static android.view.Gravity.CENTER;

/**
 * Created by Igorr on 25.12.2017.
 */

public class ConfirmActivity extends AppCompatActivity {
    Button btnEnter;
    CheckBox checkBox;
    TextView enterYourCodeHere;

    // @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_activity);

        btnEnter = findViewById(R.id.button_enter);
        checkBox = findViewById(R.id.checkAccepted);
        enterYourCodeHere = findViewById(R.id.enter_your_code_here);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (!checkBox.isChecked()) btnEnter.setEnabled(false);

        final Intent contacts = new Intent(this, Contacts.class);
        final Snackbar snbImDone = Snackbar.make(findViewById(R.id.layout), "Я молодец!", Snackbar.LENGTH_INDEFINITE);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((v == btnEnter) && !(enterYourCodeHere.getText().toString().isEmpty())) {
                    snbImDone.setAction("Далее...", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(contacts);
                        }
                    });
                    snbImDone.show();
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Ошибка: пустое поле", (Toast.LENGTH_SHORT));
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        };
        btnEnter.setOnClickListener(onClickListener);
    }

    public void onCheckboxClicked(View view) {
        if (!checkBox.isChecked()) btnEnter.setEnabled(false);
        else btnEnter.setEnabled(true);
    }
}
