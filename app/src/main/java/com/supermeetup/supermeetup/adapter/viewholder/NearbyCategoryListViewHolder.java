package com.supermeetup.supermeetup.adapter.viewholder;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.supermeetup.supermeetup.R;
import com.supermeetup.supermeetup.adapter.CategoryAdapter;
import com.supermeetup.supermeetup.model.Category;

import java.util.ArrayList;

/**
 * Created by Irene on 10/15/17.
 */

public class NearbyCategoryListViewHolder extends RecyclerView.ViewHolder {
    private RecyclerView mCategoryList;

    public NearbyCategoryListViewHolder(View itemView) {
        super(itemView);
        mCategoryList = (RecyclerView) itemView.findViewById(R.id.catetorylist);
        mCategoryList.setLayoutManager(new GridLayoutManager(itemView.getContext(), 4));
    }

    public void bind(ArrayList<Category> categories){
        mCategoryList.setAdapter(new CategoryAdapter(mCategoryList.getContext(), categories, 7, null));
    }
}