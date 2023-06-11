package com.example.hesham.touraround;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TourCollectionAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TourCollectionAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Historical();
        } else if (position == 1) {
            return new Hotel();
        } else if (position == 2) {
            return new Restorant();
        } else {
            return new Mosques();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Historical);
        } else if (position == 1) {
            return mContext.getString(R.string.Hotel);
        } else if (position == 2) {
            return mContext.getString(R.string.Restorant);
        } else {
            return mContext.getString(R.string.Mosques);
        }
    }
}