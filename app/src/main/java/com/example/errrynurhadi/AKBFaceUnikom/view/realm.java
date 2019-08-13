package com.example.errrynurhadi.AKBFaceUnikom.view;
//Tanggal pengerjaan : 21-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.errrynurhadi.AKBFaceUnikom.R;

public class login extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main, container,false);
    }
}