package com.example.errrynurhadi.AKBFaceUnikom.presenter;
//Tanggal pengerjaan : 19-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.errrynurhadi.AKBFaceUnikom.ItemClickListener;
import com.example.errrynurhadi.AKBFaceUnikom.R;

import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    //OUR VIEWS
    TextView tnim, tnama, tkelas, ttelepon, temail,tsosmed;
    ImageView img;
    private ItemClickListener itemClickListener;

    //our contructor
    public MyHolder(View itemView) {
        super(itemView);

        tnim = (TextView) itemView.findViewById(R.id.namaST);
        tnama = (TextView) itemView.findViewById(R.id.nimST);
        tkelas = (TextView) itemView.findViewById(R.id.kelasST);
        ttelepon = (TextView) itemView.findViewById(R.id.telpST);
        temail = (TextView) itemView.findViewById(R.id.emailST);
        tsosmed = (TextView) itemView.findViewById(R.id.sosmedST);
        img = (ImageView) itemView.findViewById(R.id.gambarST);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;

    }
}
