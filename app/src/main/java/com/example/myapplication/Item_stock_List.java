

package com.example.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Item_stock_List extends AppCompatActivity {
    private ListView listViewProducts;
    private DataBaseHelper databaseHelper;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_stock_list);

        listViewProducts = findViewById(R.id.list_view_products);
        Button update = findViewById(R.id.btn_up);
        Button delete = findViewById(R.id.btn_del);
        databaseHelper = new DataBaseHelper(this);

        displayProducts();

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleUpdate();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleDelete();
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        // Refresh the displayed products
        displayProducts();
    }

    private void displayProducts() {
        Cursor cursor = databaseHelper.getAllProducts();
        if (cursor != null && cursor.getCount() > 0) {
            ItemAdapter adapter = new ItemAdapter(this, cursor, 0);
            listViewProducts.setAdapter(adapter);
        }
        else {
            Toast.makeText(this, "No products available", Toast.LENGTH_SHORT).show();
        }
    }

    private void handleUpdate() {
        // Logic for updating a product
        Intent intent = new Intent(Item_stock_List.this, Update_Stock.class); // Assuming HomeActivity is the activity after login
        startActivity(intent);
    }

    //
    private void handleDelete() {
        Intent intent = new Intent(Item_stock_List.this, Delete_Stock.class); // Assuming HomeActivity is the activity after login
        startActivity(intent);
        Toast.makeText(this, "Delete button clicked", Toast.LENGTH_SHORT).show();
    }
}