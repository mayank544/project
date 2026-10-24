package com.mayank544.foremadedemo;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setPadding(48, 72, 48, 48);
        root.setBackgroundColor(Color.rgb(9, 20, 39));

        TextView title = new TextView(this);
        title.setText("Foremade");
        title.setTextColor(Color.WHITE);
        title.setTextSize(32);
        title.setGravity(Gravity.CENTER);
        root.addView(title, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView subtitle = new TextView(this);
        subtitle.setText("Demo marketplace build");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(16);
        subtitle.setPadding(0, 18, 0, 50);
        subtitle.setGravity(Gravity.CENTER);
        root.addView(subtitle);

        TextView product = new TextView(this);
        product.setText("Classic Sneakers\n£39.99\n\nDemo product for release testing");
        product.setTextColor(Color.WHITE);
        product.setTextSize(20);
        product.setPadding(36, 36, 36, 36);
        product.setBackgroundColor(Color.rgb(20, 40, 70));
        root.addView(product, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        Button button = new Button(this);
        button.setText("Add to Basket");
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        buttonParams.setMargins(0, 36, 0, 0);
        root.addView(button, buttonParams);

        setContentView(root);
    }
}
