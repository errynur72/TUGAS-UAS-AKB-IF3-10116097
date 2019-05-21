package com.example.errrynurhadi.AKBFaceUnikom.view;
//Tanggal pengerjaan : 18-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.errrynurhadi.AKBFaceUnikom.presenter.GridAdapterTemanWanita;
import com.example.errrynurhadi.AKBFaceUnikom.model.Item;
import com.example.errrynurhadi.AKBFaceUnikom.R;

import java.util.ArrayList;

public class temanwanita extends Fragment {
    RecyclerView mRecyclerView;
    androidx.appcompat.widget.SearchView searchView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.temanwanita_page, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        searchView = (androidx.appcompat.widget.SearchView) view.findViewById(R.id.cari_wanita);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        final GridAdapterTemanWanita mAdapter = new GridAdapterTemanWanita(getActivity(), preparedData());
        mRecyclerView.setAdapter(mAdapter);

        searchView.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                mAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return view;
    }

    private ArrayList<Item> preparedData() {

        ArrayList<Item> arrayList = new ArrayList<Item>();
        Item  nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ira Yuti");
        nama.setThumbnail(R.drawable.w_irayuti);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Vanadia Aviandi");
        nama.setThumbnail(R.drawable.w_vanadia);
        arrayList.add(nama);



        return arrayList;
    }
}
