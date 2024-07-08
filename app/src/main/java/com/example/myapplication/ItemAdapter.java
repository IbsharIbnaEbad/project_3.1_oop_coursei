/*package com.example.myapplication;

import android.database.Cursor;

public class ItemAdapter {
    public ItemAdapter(Item_stock_List itemStockList, Cursor cursor, int i) {


    }
}*/

package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemAdapter extends CursorAdapter {


    public ItemAdapter(Context context, Cursor cursor, int flags) {
        super(context, cursor, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return inflater.inflate(R.layout.item_layout_style, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView nameTextView = view.findViewById(R.id.text_view_product_name);
        TextView priceTextView = view.findViewById(R.id.text_view_product_price);
        TextView descriptionTextView = view.findViewById(R.id.text_view_product_quantity);
        ImageView productImageView = view.findViewById(R.id.image_view_product);

        String name = cursor.getString(cursor.getColumnIndexOrThrow(DataBaseHelper.COL_Item_NAME));
        double price = cursor.getDouble(cursor.getColumnIndexOrThrow(DataBaseHelper.COL_Item_PRICE));
        String description = cursor.getString(cursor.getColumnIndexOrThrow(DataBaseHelper.COL_Item_Description));
        byte[] imageBytes = cursor.getBlob(cursor.getColumnIndexOrThrow(DataBaseHelper.COL_Item_IMAGE_URI));

        // Set text and image
        nameTextView.setText(name);
        priceTextView.setText(String.valueOf(price));
        descriptionTextView.setText(description);


        if (imageBytes != null && imageBytes.length > 0) {
            Bitmap bitmap = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
            productImageView.setImageBitmap(bitmap);
        } else {
            productImageView.setImageResource(R.drawable.img_background); // Use a default image if no image is available
        }



    }

}














