package com.example.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PaysAdapter extends RecyclerView.Adapter<PaysAdapter.PaysViewHolder>{
    private List<PaysS> paysList;
    public PaysAdapter (List<PaysS> paysList) {
        this.paysList = paysList;
    }

    @NonNull
    @Override
    public PaysAdapter.PaysViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext ()) . inflate(R.layout.list_item_pays, parent, false);
        return new PaysViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaysAdapter.PaysViewHolder holder, int position) {
        PaysS pays = paysList. get (position);
        holder.textViewNom.setText(pays.getNom());
        holder. textViewCapital.setText(pays.getCapital());
    }

    @Override
    public int getItemCount() {
        return paysList.size();
    }

    public class PaysViewHolder extends RecyclerView. ViewHolder {
        TextView textViewNom, textViewCapital;

        public PaysViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNom = itemView.findViewById(R.id.textViewNom);
            textViewCapital = itemView.findViewById(R.id.textViewCapital);
        }}
}
