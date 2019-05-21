package com.example.errrynurhadi.AKBFaceUnikom.presenter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.errrynurhadi.AKBFaceUnikom.model.ModelObjectViewPager;

import androidx.viewpager.widget.PagerAdapter;
//Tanggal pengerjaan : 20-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
public class CustomAdapterViewPager extends PagerAdapter {
    private Context mContext;

    public CustomAdapterViewPager(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        ModelObjectViewPager modelObject = ModelObjectViewPager.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        return layout;
    }


    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return ModelObjectViewPager.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        ModelObjectViewPager customPagerEnum = ModelObjectViewPager.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }

}