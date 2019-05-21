package com.example.errrynurhadi.AKBFaceUnikom.presenter;
//Tanggal pengerjaan : 19-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import com.example.errrynurhadi.AKBFaceUnikom.DetailSeluruhTemanActivity;
import com.example.errrynurhadi.AKBFaceUnikom.ItemClickListener;
import com.example.errrynurhadi.AKBFaceUnikom.R;
import com.example.errrynurhadi.AKBFaceUnikom.model.ListSeluruhTeman;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class ListViewAdapter extends RecyclerView.Adapter<MyHolder> implements Filterable {



    ArrayList<ListSeluruhTeman> mItems, filterlist;
    Context context;

    public ListViewAdapter(Context context, ArrayList<ListSeluruhTeman> mItems) {
        this.context = context;
        this.mItems = mItems;
        this.filterlist = mItems;
    }


    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //INFLATE A VIEW FROM XML
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, null);

        //HOLDER
        MyHolder holder = new MyHolder(v);
        return holder;
    }


    //DATA IS BEING BOUND TO VIEWS
    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {

        //BIND DATA
        holder.tnim.setText(mItems.get(position).getTnim());
        holder.tnama.setText(mItems.get(position).getTnama());
        holder.tkelas.setText(mItems.get(position).getTkelas());
        holder.ttelepon.setText(mItems.get(position).getTtelepon());
        holder.temail.setText(mItems.get(position).getTemail());
        holder.tsosmed.setText(mItems.get(position).getTsosmed());
        holder.img.setImageResource(mItems.get(position).getGambar());



        //WHEN ITEM IS CLICKED
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int gambar) {

                //INTENT OBJ
                Intent i = new Intent(context, DetailSeluruhTemanActivity.class);

                //ADD DATA TO OUR INTENT
                i.putExtra("Nim", mItems.get(position).getTnim());
                i.putExtra("Nama", mItems.get(position).getTnama());
                i.putExtra("Kelas", mItems.get(position).getTkelas());
                i.putExtra("Telepon", mItems.get(position).getTtelepon());
                i.putExtra("Email", mItems.get(position).getTemail());
                i.putExtra("Sosmed", mItems.get(position).getTsosmed());
                i.putExtra("Images", mItems.get(position).getGambar());

                //START DETAIL ACTIVITY
                context.startActivity(i);
            }
        });
    }

    //TOTAL PLAYERS
    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public Filter getFilter() {
        CustomFilterList filter = new CustomFilterList(this, filterlist);
        return filter;
    }
}
