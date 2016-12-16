package com.example.android.miwok;

/**
 * Created by Shreyansh Singh on 09-12-2016.
 */

public class Word {

    private String defaultString;
    private String miwokString;
    private int mImageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String s1, String s2, int ImageResourceId) {
        defaultString = s1;
        miwokString = s2;
        mImageResourceId = ImageResourceId;

    }

    public Word(String s1, String s2) {
        defaultString = s1;
        miwokString = s2;

    }

    public String getdefaultString() {
        return defaultString;
    }

    public String getmiwokString() {
        return miwokString;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}


