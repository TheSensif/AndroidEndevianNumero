package com.thesensif.androidendeviannumero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int secretNumber = (int)(Math.random() * 100);


        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editTextNumberSigned);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int uNumber = Integer.parseInt(editText.getText().toString());
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_LONG;
                if (secretNumber == uNumber) {
                    CharSequence text = "Has ganado";
                    toastShow(context,text,duration);
                }
                else if (secretNumber > uNumber) {
                    CharSequence text = "El numer " + uNumber + " es mas pequeño";
                    toastShow(context,text,duration);
                }else {
                    CharSequence text = "El numer " + uNumber + " es mas grande";
                    toastShow(context,text,duration);
                }
            }
        });
    }

    private void toastShow(Context context,CharSequence text,int duration) {
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}