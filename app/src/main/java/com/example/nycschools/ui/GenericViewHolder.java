package com.example.nycschools.ui;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by Srinivas on 4/15/2018.
 */

public class GenericViewHolder extends RecyclerView.ViewHolder {
    public GenericViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Object obj) {
        binding.setVariable(BR.data, obj);
        binding.executePendingBindings();
    }

    public final ViewDataBinding binding;
}
