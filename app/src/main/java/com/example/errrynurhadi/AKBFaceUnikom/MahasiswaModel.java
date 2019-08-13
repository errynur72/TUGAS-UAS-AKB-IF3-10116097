package com.nguliktime.learnrealm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class MahasiswaModel extends RealmObject {

    @PrimaryKey
    private Integer id;
    private Integer nim;
    private String nama;

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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
