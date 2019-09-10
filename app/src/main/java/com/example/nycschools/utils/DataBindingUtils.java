package com.example.nycschools.utils;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nycschools.ui.GenericViewHolder;

/**
 * Created by Srinivas on 4/15/2018.
 */

public class DataBindingUtils {

    /**
     * Set Adapter to Recycler View
     * This is used with the {adapter}
     * attributes in the app namespace.
     * This will work if you import DataBindingUtils and call method with arguments
     */
    @BindingAdapter("adapter")
    public static void setAdapter(RecyclerView recyclerView, RecyclerView.Adapter<GenericViewHolder> viewHolderAdapter) {
        recyclerView.setAdapter(viewHolderAdapter);
    }

    /**
     * Set layoutManager to Recycler View
     * This is used with the {layoutManager}
     * attributes in the app namespace.
     * This will work if you import DataBindingUtils and call method with arguments
     */
    @BindingAdapter("layoutManager")
    public static void setLayoutManager(RecyclerView recyclerView, LinearLayoutManager layoutManager) {
        recyclerView.setLayoutManager(layoutManager);
    }
}
