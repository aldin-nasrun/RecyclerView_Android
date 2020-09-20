package com.example.newscrool;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mAdapter extends RecyclerView.Adapter<mAdapter.mViewHolder> {
 private ArrayList<itemsModel> dataItem;

 static class mViewHolder extends RecyclerView.ViewHolder {
        TextView appName,description;
        ImageView icon;

        mViewHolder(View view){
            super(view);
            appName = view.findViewById(R.id.tv_app);
            description = view.findViewById(R.id.tv_description);
            icon = view.findViewById(R.id.iv_icon);
        }
    }
    mAdapter(ArrayList<itemsModel> data){
        this.dataItem = data;
    }

    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent, false);
        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mViewHolder holder, int position) {
        TextView appName = holder.appName;
        TextView description = holder.description;
        ImageView icon = holder.icon;

        appName.setText(dataItem.get(position).getAppName());
        description.setText(dataItem.get(position).getDescription());
        icon.setImageResource(dataItem.get(position).getIcon());


    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

}
