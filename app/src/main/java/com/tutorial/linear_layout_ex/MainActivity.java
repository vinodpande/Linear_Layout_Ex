package com.tutorial.linear_layout_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


/*
LinearLayout is a ViewGroup subclass which is used to render all child View instances one by one either in Horizontal direction or Vertical direction based on
the orientation property.

We can specify the linear layout orientation using android:orientation attribute.

In LinearLayout, the child View instances arranged one by one, so the horizontal list will have only one row of multiple columns and vertical list will have one column of multiple rows.

Android LinearLayout Declaration

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical" >
    <!-- Add Child Views Here -->
</LinearLayout>

Layout Weight Attribute
If you observe above example we used layout weight attribute (android:layout_weight) in child view.
Actually, this attribute is used by child views to specify how much space the View should occupy on the screen.
If we assign larger weight value to child view, then it will expand to fill any remaining space in the parent view.

If you observe above example, we used three text fields and we assigned weight value to only one text field.
The two text fields without weight will occupy only the area required for its content and the other text field with weight value will expand
to fill the remaining space after all three fields measured.

This is how we can use LinearLayout in android applications
to render all View instances one by one either in Horizontal direction or Vertical direction based on the orientation property.
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
