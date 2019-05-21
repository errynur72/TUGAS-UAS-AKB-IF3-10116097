package com.example.errrynurhadi.AKBFaceUnikom.presenter;
//Tanggal pengerjaan : 19-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.errrynurhadi.AKBFaceUnikom.R;
import com.example.errrynurhadi.AKBFaceUnikom.model.Item;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class GridAdapterHome3 extends RecyclerView.Adapter<GridAdapterHome3.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private Context mContext;

    List<Item> mItems;

    public GridAdapterHome3() {
        super();
        mItems = new ArrayList<Item>();
        Item nama = new Item();
        nama.setName("Silvia");
        nama.setThumbnail(R.drawable.s_wanita);
        mItems.add(nama);

        nama = new Item();
        nama.setName("Dio Ilham");
        nama.setThumbnail(R.drawable.s_pria);
        mItems.add(nama);

        nama = new Item();
        nama.setName("Siska");
        nama.setThumbnail(R.drawable.s_wanita);
        mItems.add(nama);

        nama = new Item();
        nama.setName("Aa Suhendar");
        nama.setThumbnail(R.drawable.s_pria);
        mItems.add(nama);

        nama = new Item();
        nama.setName("Kuswandi");
        nama.setThumbnail(R.drawable.s_pria);
        mItems.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        mItems.add(nama);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_horizontal, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        Item nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
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

