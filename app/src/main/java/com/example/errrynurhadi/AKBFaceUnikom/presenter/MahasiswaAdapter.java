package com.example.errrynurhadi.AKBFaceUnikom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MyViewHolder> {
    private List<MahasiswaModel> mahasiswaModels;
    Context context;

    public MahasiswaAdapter(Context context, List<MahasiswaModel> mahasiswaModels){
        this.context = context;
        this.mahasiswaModels = mahasiswaModels;
    }

    @Override
    public MahasiswaAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahasiswa, parent, false);
        return new MyViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(MahasiswaAdapter.MyViewHolder holder, int position) {
        final MahasiswaModel model = mahasiswaModels.get(position);
        holder.nim.setText(model.getNim().toString());
        holder.telepon.setText(model.getTelepon().toString());
        holder.nama.setText(model.getNama());
        holder.kelas.setText(model.getKelas());
        holder.email.setText(model.getEmail());
        holder.sosmed.setText(model.getSosmed());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("id", model.getId().toString());
                intent.putExtra("nim", model.getNim().toString());
                intent.putExtra("telepon", model.getTelepon().toString());
                intent.putExtra("nama", model.getNama());
                intent.putExtra("kelas", model.getKelas());
                intent.putExtra("email", model.getEmail());
                intent.putExtra("sosmed", model.getSosmed());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mahasiswaModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nim, nama, kelas, email, sosmed, telepon;

        public MyViewHolder(View itemView){
            super(itemView);
            nim = itemView.findViewById(R.id.tvNim);
            telepon = itemView.findViewById(R.id.tvTelepon);
            nama = itemView.findViewById(R.id.tvNama);
            kelas= itemView.findViewById(R.id.tvKelas);
            email= itemView.findViewById(R.id.tvEmail);
            sosmed= itemView.findViewById(R.id.tvSosmed);

        }
    }
}
