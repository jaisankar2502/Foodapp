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

public class Manicategoryadapter extends RecyclerView.Adapter<Manicategoryadapter.Maincategoryholder>{
 private  MainList[]mainLists;
    Context baseContext;
    public Manicategoryadapter(MainList[] mainLists, Context baseContext) {
        this.mainLists=mainLists;
        this.baseContext=baseContext;
    }

    @NonNull
    @Override
    public Manicategoryadapter.Maincategoryholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View item= layoutInflater.inflate(R.layout.item_rv_sub_category,parent,false);
        Maincategoryholder mainholder= new Maincategoryholder(item);
        return mainholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Manicategoryadapter.Maincategoryholder holder, int position) {

        Glide.with(baseContext).load(mainLists[position].getImgid()).into(holder.imageView);
        holder.textView.setText(mainLists[position].getName());

    }

    @Override
    public int getItemCount() {
        return mainLists.length;
    }

    public class Maincategoryholder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public Maincategoryholder(@NonNull View itemView) {
            super(itemView);
            this.imageView=itemView.findViewById(R.id.img_dish);
            this.textView= itemView.findViewById(R.id.tv_dish_name);

        }
    }
}


