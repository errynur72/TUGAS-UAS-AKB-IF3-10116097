package com.example.errrynurhadi.AKBFaceUnikom.view;
//Tanggal pengerjaan : 19-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.errrynurhadi.AKBFaceUnikom.model.ListSeluruhTeman;
import com.example.errrynurhadi.AKBFaceUnikom.presenter.ListViewAdapter;
import com.example.errrynurhadi.AKBFaceUnikom.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class SeluruhTeman extends Fragment {

    androidx.appcompat.widget.SearchView searchView;
    FloatingActionButton btnOpenDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.seluruhteman_page, container, false);



        btnOpenDialog = rootView.findViewById(R.id.fab_plus);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });








        preparedData();
        //REFERENCE RECYCLER
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recyclerViewST);
        searchView = (androidx.appcompat.widget.SearchView) rootView.findViewById(R.id.cari_list_teman);

        //SET PROPERTIES
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        final ListViewAdapter adapter = new ListViewAdapter(getActivity(), preparedData());
        rv.setAdapter(adapter);

        searchView.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return rootView;
    }
    private void openDialog() {
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View subView = inflater.inflate(R.layout.alert_dialog, null);
        final EditText nama_dialog = subView.findViewById(R.id.txt_nama_dialog);
        final EditText nim_dialog = subView.findViewById(R.id.txt_nim_dialog);
        final EditText kelas_dialog = subView.findViewById(R.id.txt_kelas_dialog);
        final EditText telp_dialog = subView.findViewById(R.id.txt_telp_dialog);
        final EditText email_dialog = subView.findViewById(R.id.txt_email_dialog);
        final EditText socmed_dialog = subView.findViewById(R.id.txt_socmed_dialog);
        Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher);


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Tambah Teman");
        builder.setMessage("Masukan Data Teman");
        builder.setView(subView);
        AlertDialog alertDialog = builder.create();

        builder.setPositiveButton("<font color='#FF7F27'>OK</font>", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ArrayList<ListSeluruhTeman> arrayList = new ArrayList<>();
                ListSeluruhTeman p = new ListSeluruhTeman();

                p = new ListSeluruhTeman();
                p.setTnama("alga");
                p.setTnim("NIM : 10117234");
                p.setTkelas("Kelas : IF -7");
                p.setTtelepon("Telp : 081220251997");
                p.setTemail("Email : vanadia@gmail.com");
                p.setTsosmed("Instagram : vanadiaaviandi");
                p.setGambar(R.drawable.s_vanadia);
                arrayList.add(p);



            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Cancel", Toast.LENGTH_LONG).show();
            }
        });

        builder.show();

    }

    //ADD PLAYERS TO ARRAYLIST
    private ArrayList<ListSeluruhTeman> preparedData() {
        ArrayList<ListSeluruhTeman> arrayList = new ArrayList<>();
        ListSeluruhTeman p = new ListSeluruhTeman();

        p = new ListSeluruhTeman();
        p.setTnama("Vanadia Aviandi");
        p.setTnim("NIM : 10117234");
        p.setTkelas("Kelas : IF -7");
        p.setTtelepon("Telp : 081220251997");
        p.setTemail("Email : vanadia@gmail.com");
        p.setTsosmed("Instagram : vanadiaaviandi");
        p.setGambar(R.drawable.s_vanadia);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Ghina Rosyidah");
        p.setTnim("NIM : 10118234");
        p.setTkelas("Kelas : IF -7");
        p.setTtelepon("Telp : 081220251997");
        p.setTemail("Email : ghina72@gmail.com");
        p.setTsosmed("Instagram : erghin");
        p.setGambar(R.drawable.s_ghina);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Nida Nurmalia");
        p.setTnim("NIM : 10167234");
        p.setTkelas("Kelas : AK-2");
        p.setTtelepon("Telp : 081220258767");
        p.setTemail("Email : nidanurm@gmail.com");
        p.setTsosmed("Instagram : nidanurmalia");
        p.setGambar(R.drawable.s_nida);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Anggun Tri");
        p.setTnim("NIM : 10134234");
        p.setTkelas("Kelas : IF -8");
        p.setTtelepon("Telp : 081223861997");
        p.setTemail("Email : annggun@gmail.com");
        p.setTsosmed("Instagram : angguntri");
        p.setGambar(R.drawable.s_wanita);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Ilham Ramadhan");
        p.setTnim("NIM : 10457234");
        p.setTkelas("Kelas : IF -3");
        p.setTtelepon("Telp : 081268951993");
        p.setTemail("Email : ilham@gmail.com");
        p.setTsosmed("Instagram : ilhamramad");
        p.setGambar(R.drawable.s_pria);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Seren sinani");
        p.setTnim("NIM : 10117234");
        p.setTkelas("Kelas : IF -7");
        p.setTtelepon("Telp : 098657652987");
        p.setTemail("Email : seren72@gmail.com");
        p.setTsosmed("Instagram : serensinani");
        p.setGambar(R.drawable.s_wanita);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Fathia");
        p.setTnim("NIM : 10117665");
        p.setTkelas("Kelas : IF -10");
        p.setTtelepon("Telp : 098792467165");
        p.setTemail("Email : fathia87@gmail.com");
        p.setTsosmed("Instagram : fathiaazzahra");
        p.setGambar(R.drawable.s_wanita);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Ghina Rosyidah");
        p.setTnim("NIM : 10118234");
        p.setTkelas("Kelas : IF -6");
        p.setTtelepon("Telp : 081220251093");
        p.setTemail("Email : ghina@gmail.com");
        p.setTsosmed("Instagram : erghin");
        p.setGambar(R.drawable.s_ghina);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Nida Nurmalia");
        p.setTnim("NIM : 10167234");
        p.setTkelas("Kelas : AK-2");
        p.setTtelepon("Telp : 081220258767");
        p.setTemail("Email : nidanurm@gmail.com");
        p.setTsosmed("Instagram : nidanurmalia");
        p.setGambar(R.drawable.s_nida);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Anggun Tri");
        p.setTnim("NIM : 10134234");
        p.setTkelas("Kelas : IF -8");
        p.setTtelepon("Telp : 081223861997");
        p.setTemail("Email : annggun@gmail.com");
        p.setTsosmed("Instagram : angguntri");
        p.setGambar(R.drawable.s_wanita);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Ilham Ramadhan");
        p.setTnim("NIM : 10457234");
        p.setTkelas("Kelas : IF -3");
        p.setTtelepon("Telp : 081268951993");
        p.setTemail("Email : ilham@gmail.com");
        p.setTsosmed("Instagram : ilhamramad");
        p.setGambar(R.drawable.s_pria);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Seren sinani");
        p.setTnim("NIM : 10117234");
        p.setTkelas("Kelas : IF -7");
        p.setTtelepon("Telp : 098657652987");
        p.setTemail("Email : seren72@gmail.com");
        p.setTsosmed("Instagram : serensinani");
        p.setGambar(R.drawable.s_wanita);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Fathia");
        p.setTnim("NIM : 10117665");
        p.setTkelas("Kelas : IF -10");
        p.setTtelepon("Telp : 098792467165");
        p.setTemail("Email : fathia87@gmail.com");
        p.setTsosmed("Instagram : fathiaazzahra");
        p.setGambar(R.drawable.s_wanita);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Ghina Rosyidah");
        p.setTnim("NIM : 10118234");
        p.setTkelas("Kelas : IF -6");
        p.setTtelepon("Telp : 081220251093");
        p.setTemail("Email : ghina@gmail.com");
        p.setTsosmed("Instagram : erghin");
        p.setGambar(R.drawable.s_ghina);
        arrayList.add(p);

        p = new ListSeluruhTeman();
        p.setTnama("Nida Nurmalia");
        p.setTnim("NIM : 10167234");
        p.setTkelas("Kelas : AK-2");
        p.setTtelepon("Telp : 081220258767");
        p.setTemail("Email : nidanurm@gmail.com");
        p.setTsosmed("Instagram : nidanurmalia");
        p.setGambar(R.drawable.s_nida);
        arrayList.add(p);
        return arrayList;
    }
}

