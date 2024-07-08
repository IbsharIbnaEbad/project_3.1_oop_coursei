package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycleviewone extends AppCompatActivity {
ArrayList<itemmodel> itemmodelArrayList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycleviewone);

        RecyclerView recyclerView =findViewById(R.id.item_list);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        itemmodelArrayList.add(new itemmodel(R.drawable.img_background, "A", "20"));
        itemmodelArrayList.add(new itemmodel(R.drawable.img_computer    , "Abbbbbbb", "220"));
        // sobgula ono add kormu item

        RecycleAdapterItem adapterItem = new RecycleAdapterItem(this,itemmodelArrayList);
        recyclerView.setAdapter(adapterItem);








    }
}