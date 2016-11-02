package com.example.binding;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by christianlee on 2016-11-01.
 */

public class BindingViewHolder <T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    private  T mBinding;

    public BindingViewHolder(T binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public  T getBinding(){
        return  mBinding;
    }
}
