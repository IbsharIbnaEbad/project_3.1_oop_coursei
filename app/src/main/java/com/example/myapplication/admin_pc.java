

package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class admin_pc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_pc);

        Button btnInsertProduct, btn_item_list, btn_updatedlt;

        btnInsertProduct = findViewById(R.id.btn_insert_product);
        btn_item_list = findViewById(R.id.btn_item_list);
        btn_updatedlt = findViewById(R.id.btn_updatedlt);

        btnInsertProduct.setOnClickListener(v -> {
            Intent intent = new Intent(admin_pc.this, Insert_Stock.class);
            startActivity(intent);
        });

        btn_item_list.setOnClickListener(v -> {
            Intent intent = new Intent(admin_pc.this, Item_stock_List.class);
            startActivity(intent);


        });
        btn_updatedlt.setOnClickListener(v -> {
            Intent intent = new Intent(admin_pc.this,  Item_stock_List.class);
            startActivity(intent);


    });
}}