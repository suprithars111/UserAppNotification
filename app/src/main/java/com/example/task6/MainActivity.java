package com.example.task6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Gravity.*;


public class MainActivity extends AppCompatActivity {

    TextView txtName;
    Button btnName = (Button) findViewById(R.id.btnName);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (TextView) findViewById(R.id.txtName);

        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setMessage("Are you sure?")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {

                                txtName.setText("Supritha");

                            }
                        })
                        .setNegativeButton("Cancel",null);

                AlertDialog alert = builder.create();
                alert.show();
            }
        });


    }

    public void displayToast( View view) {
        Toast.makeText(MainActivity.this,"Hello this is toast message",Toast.LENGTH_SHORT).show();
    }

}
