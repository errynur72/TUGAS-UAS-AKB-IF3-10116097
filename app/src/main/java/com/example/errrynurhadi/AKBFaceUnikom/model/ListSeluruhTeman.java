package com.example.errrynurhadi.AKBFaceUnikom.model;
//Tanggal pengerjaan : 19-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
public class ListSeluruhTeman {
    private String tnim;
    private String tnama;
    private String tkelas;
    private String ttelepon;
    private String temail;
    private String tsosmed;


    private int gambar;

    public String getTnim() {
        return tnim;
    }

    public String getTnama() {
        return tnama;
    }

    public String getTkelas() {
        return tkelas;
    }

    public String getTtelepon() {return ttelepon;}

    public String getTemail() {return temail;}

    public String getTsosmed() {return tsosmed;}

    public int getGambar() { return gambar;    }



    public void setTnim(String tnim) {
        this.tnim = tnim;
    }

    public void setTnama(String tnama) {
        this.tnama = tnama;
    }

    public void setTkelas(String tkelas) {
        this.tkelas = tkelas;
    }

    public void setTtelepon(String ttelepon) {
        this.ttelepon = ttelepon;
    }

    public void setTemail(String temail) {
        this.temail = temail;
    }

    public void setTsosmed(String tsosmed) {
        this.tsosmed = tsosmed;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
