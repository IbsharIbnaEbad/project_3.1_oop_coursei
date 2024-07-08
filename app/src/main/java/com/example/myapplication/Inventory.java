package com.example.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Inventory extends AppCompatActivity {
    Button btnlog;
    EditText edtfn, edtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inventory);



        edtfn = findViewById(R.id.edtfn);
        edtpass = findViewById(R.id.edtpass);
        btnlog = findViewById(R.id.btnlog);


        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtfn.getText().toString();
                String password = edtpass.getText().toString();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Inventory.this, "fill the data", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (username.equals("pcplus") && password.equals("1")) {
                        Intent intent = new Intent(Inventory.this, admin_pc.class);
                        startActivity(intent);
                    }
                    else {
                        DataBaseHelper dbHelper = new DataBaseHelper(Inventory.this);
                        boolean result = dbHelper.checkusrbyusername(username, password);

                        if (result) {
                            Toast.makeText(Inventory.this, "Hello!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Inventory.this, Item_stock_List.class);  // Changed to Menu.class
                            startActivity(intent);
                        } else {
                            Toast.makeText(Inventory.this, "Invalid credentials!", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }
}