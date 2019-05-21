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

import com.example.errrynurhadi.AKBFaceUnikom.presenter.GridAdapterTemanHmif;
import com.example.errrynurhadi.AKBFaceUnikom.model.Item;
import com.example.errrynurhadi.AKBFaceUnikom.R;

import java.util.ArrayList;

public class temanhmif extends Fragment {
    RecyclerView mRecyclerView;
    androidx.appcompat.widget.SearchView searchView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.temanhmif_page, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewHmif);
        searchView = (androidx.appcompat.widget.SearchView) view.findViewById(R.id.cari_temanhmif);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));

        final GridAdapterTemanHmif mAdapter = new GridAdapterTemanHmif(getActivity(), preparedData());
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
        return view ;
    }

    private ArrayList<Item> preparedData() {
        ArrayList<Item> arrayList = new ArrayList<Item>();
        Item nama = new Item();
        nama.setName("Erry");
        nama.setThumbnail(R.drawable.p_erry);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Dio Ilham");
        nama.setThumbnail(R.drawable.s_pria);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Iskandar");
        nama.setThumbnail(R.drawable.s_pria);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Sekar");
        nama.setThumbnail(R.drawable.s_wanita);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Esa");
        nama.setThumbnail(R.drawable.s_pria);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("AA suhendar");
        nama.setThumbnail(R.drawable.s_pria);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Ibnu");
        nama.setThumbnail(R.drawable.s_pria);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Siska");
        nama.setThumbnail(R.drawable.s_wanita);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Syifa");
        nama.setThumbnail(R.drawable.s_wanita);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Kuswandi");
        nama.setThumbnail(R.drawable.s_pria);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Suherman");
        nama.setThumbnail(R.drawable.s_pria);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Fathia");
        nama.setThumbnail(R.drawable.s_wanita);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Melinda");
        nama.setThumbnail(R.drawable.s_wanita);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("Fikri");
        nama.setThumbnail(R.drawable.s_pria);
        arrayList.add(nama);

        nama = new Item();
        nama.setName("endang");
        nama.setThumbnail(R.drawable.s_pria);
        arrayList.add(nama);

        return arrayList;
    }

}

