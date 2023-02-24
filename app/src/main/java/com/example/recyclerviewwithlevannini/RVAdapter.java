package com.example.recyclerviewwithlevannini;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVViewHolder> {

    Context context;
    List<String> stringList;


    public RVAdapter(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public RVAdapter.RVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        return new RVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.RVViewHolder holder, int position) {
        String data = stringList.get(position);
        String data1 = String.valueOf(position+1);
        holder.name.setText(data);
        holder.age.setText(data1);

        holder.name.setOnClickListener(v -> Toast.makeText(context, data, Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public class RVViewHolder extends RecyclerView.ViewHolder{
        TextView name, age;

        public RVViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameTV);
            age = itemView.findViewById(R.id.ageTV);
        }
    }
}
