package com.example.errrynurhadi.AKBFaceUnikom.presenter;
//Tanggal pengerjaan : 18-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.errrynurhadi.AKBFaceUnikom.R;
import com.example.errrynurhadi.AKBFaceUnikom.model.Item;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class GridAdapterTemanHmif extends RecyclerView.Adapter<GridAdapterTemanHmif.ViewHolder> implements Filterable {

    ArrayList<Item> mItems, filterlist;
    Context context;

    public GridAdapterTemanHmif(Context context, ArrayList<Item> mItems) {
        this.context = context;
        this.mItems = mItems;
        this.filterlist = mItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Item nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    @Override
    public Filter getFilter() {
        CustomFilter3 filter = new CustomFilter3(this, filterlist);
        return filter;
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.image_view);
            tvspecies = (TextView)itemView.findViewById(R.id.name);

        }
    }
}

