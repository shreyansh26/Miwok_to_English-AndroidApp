package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Shreyansh Singh on 11-12-2016.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new ColorsFragment();
        } else if (position == 2)
            return new FamilyFragment();
        else
            return new PhrasesFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return "NUMBERS";
        } else if (position == 1) {
            return "COLORS";
        } else if (position == 2)
            return "FAMILY MEMBERS" ;
        else
            return "PHRASES";
    }

    @Override
    public int getCount() {
        return 4;
    }
}