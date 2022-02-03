package com.example.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodapp.R;
import com.example.foodapp.model.MainList;

public class Subcategoryadapter extends RecyclerView.Adapter<Subcategoryadapter.Subcategoryholder> {
    MainList[] mainLists;
    Context baseContext;
    public Subcategoryadapter(MainList[] mainLists, Context baseContext) {
        this.baseContext=baseContext;
        this.mainLists=mainLists;
    }

    @NonNull
    @Override
    public Subcategoryholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
       View itemview2 = layoutInflater.inflate(R.layout.item_rv_main_category,parent,false);
        Subcategoryholder subholder= new Subcategoryholder(itemview2);
        return subholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Subcategoryholder holder, int position) {
        Glide.with(baseContext).load(mainLists[position].getImgid()).into(holder.imageview2);
        holder.textview2.setText(mainLists[position].getName());


    }

    @Override
    public int getItemCount() {
        return mainLists.length;
    }

    public class Subcategoryholder extends RecyclerView.ViewHolder {
        ImageView imageview2;
        TextView textview2;
        public Subcategoryholder(@NonNull View itemView) {
            super(itemView);
            this.textview2=itemView.findViewById(R.id.tv_dish_name);
            this.imageview2=itemView.findViewById(R.id.img_dish);
        }
    }
}
