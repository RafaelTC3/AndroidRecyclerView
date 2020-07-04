package com.study.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.study.recyclerview.R;
import com.study.recyclerview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Post> postsList = new ArrayList<>();

    public Adapter(List<Post> postsList) {
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_layout, parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(postsList.get(position).getTitle());
        holder.quantity.setText(postsList.get(position).getQuantity());
        holder.image.setImageResource(postsList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView image;
        private TextView quantity;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.image);
            quantity = itemView.findViewById(R.id.quantity);
        }
    }
}
