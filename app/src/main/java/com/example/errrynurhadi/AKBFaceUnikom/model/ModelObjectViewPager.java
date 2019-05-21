package com.example.errrynurhadi.AKBFaceUnikom.model;
//Tanggal pengerjaan : 20-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import com.example.errrynurhadi.AKBFaceUnikom.R;

public enum  ModelObjectViewPager {

    RED(R.string.red, R.layout.view_pager_red),
    BLUE(R.string.blue, R.layout.view_pager_blue),
    GREEN(R.string.green, R.layout.view_pager_green);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObjectViewPager(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}