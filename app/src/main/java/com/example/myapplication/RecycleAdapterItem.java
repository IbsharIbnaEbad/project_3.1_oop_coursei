package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdapterItem extends RecyclerView.Adapter<RecycleAdapterItem.ViewHolder> {

    Context context;
    ArrayList<itemmodel> itemmodelArrayList;

    RecycleAdapterItem(Context context, ArrayList<itemmodel> itemmodelArrayList) {
        this.context = context;
        this.itemmodelArrayList = itemmodelArrayList;
    }


    @NonNull
    @Override
   /* public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.pcitems, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }*/
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.pcitems, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.img.setImageResource(itemmodelArrayList.get(position).img);
        holder.txtItem.setText(itemmodelArrayList.get(position).item);
        holder.txtitemprice.setText(itemmodelArrayList.get(position).itemprice);


    }

    @Override
    public int getItemCount() {
        return itemmodelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtItem, txtitemprice;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtItem = itemView.findViewById(R.id.item1);
            txtitemprice = itemView.findViewById(R.id.item1price);
            img = itemView.findViewById(R.id.imageitem);
        }
    }
}


