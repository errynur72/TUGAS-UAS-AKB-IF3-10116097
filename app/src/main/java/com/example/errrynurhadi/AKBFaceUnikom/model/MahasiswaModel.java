package com.example.errrynurhadi.AKBFaceUnikom;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class MahasiswaModel extends RealmObject {

    @PrimaryKey
    private Integer id;
    private Integer nim;
    private Integer telepon;
    private String nama;
    private String kelas;
    private String email;
    private String sosmed;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public Integer getNim() {
        return nim;
    }


    public void setTelepon(Integer telepon) {
        this.telepon = telepon;
    }

    public Integer getTelepon() {
        return telepon;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }


    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }



    public void setEmail(String email) {
        this.email= email;
    }

    public String getEmail() {
        return email;
    }



    public void setSosmed(String sosmed) {
        this.sosmed= sosmed;
    }

    public String getSosmed() {
        return sosmed;
    }
}
