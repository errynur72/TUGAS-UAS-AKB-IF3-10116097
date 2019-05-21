package com.example.errrynurhadi.AKBFaceUnikom.view;
//Tanggal pengerjaan : 21-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.errrynurhadi.AKBFaceUnikom.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class contact extends Fragment {
    Button btnfcb;
    Button btninst;
    Button btntlp;
    Button btnemail;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.contact, container,false);
        //deklarasi btn baru
                    btnfcb = view.findViewById(R.id.btn_facebook);
                    btninst = view.findViewById(R.id.btn_instagram);
                    btntlp = view.findViewById(R.id.btn_telp);
                    btnemail = view.findViewById(R.id.btn_email);

                    btnemail.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Intent.ACTION_SEND);
                            intent.setType("text/html");
                            intent.putExtra(Intent.EXTRA_EMAIL, "errysandria72@gmail.com");
                            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                            intent.putExtra(Intent.EXTRA_TEXT, "I'm email body.");

                            startActivity(Intent.createChooser(intent, "Send Email"));
                        }
                    });


                    btntlp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String phone = "+081220251997";
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                            startActivity(intent);
                        }


                    });

                    btnfcb.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri uri = Uri.parse("https://www.facebook.com/sandria72");
                            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                            likeIng.setPackage("com.facebook.android");

                            try {
                                startActivity(likeIng);
                            } catch (ActivityNotFoundException e) {
                                startActivity(new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.facebook.com/sandria72")));
                            }
                        }
                    });

                    btninst.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri uri = Uri.parse("http://instagram.com/_u/errynurhadi");
                            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                            likeIng.setPackage("com.instagram.android");

                            try {
                                startActivity(likeIng);
                            } catch (ActivityNotFoundException e) {
                                startActivity(new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("http://instagram.com/errynurhadi")));
                            }
                        }
                    });

        return view;


    }
}