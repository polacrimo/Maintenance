package com.example.maintenance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private ArrayList empId,
            empNom,
            empAge,
            empFonction,
            empGrade;

    CustomAdapter (Context context,
                   ArrayList empId,
                   ArrayList empNom,
                   ArrayList empAge,
                   ArrayList empFonction,
                   ArrayList empGrade) {
        this.context = context;
        this.empId = empId;
        this.empNom = empNom;
        this.empAge = empAge;
        this.empFonction = empFonction;
        this.empGrade = empGrade;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.empIdTxt.setText(String.valueOf(empId.get(position)));
        holder.empNomTxt.setText(String.valueOf(empNom.get(position)));
        holder.empAgeTxt.setText(String.valueOf(empAge.get(position)));
        holder.empFonctionTxt.setText(String.valueOf(empFonction.get(position)));
        holder.empGradeTxt.setText(String.valueOf(empGrade.get(position)));
    }

    @Override
    public int getItemCount() {
        return empId.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView empIdTxt,
                empNomTxt,
                empAgeTxt,
                empFonctionTxt,
                empGradeTxt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            empIdTxt = itemView.findViewById(R.id.empIdTxt);
            empNomTxt = itemView.findViewById(R.id.empNomTxt);
            empAgeTxt = itemView.findViewById(R.id.empAgeTxt);
            empFonctionTxt = itemView.findViewById(R.id.empFonctionTxt);
            empGradeTxt = itemView.findViewById(R.id.empGradeTxt);
        }
    }
}
