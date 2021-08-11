package com.example.miwok;



public class Word {

    //Default Translation for word
    private String mDefaultTranslation;

    // Miwok Translation for word
    private String mMiwokTranslation;

    private int mImageId = checkImage;
    private static final int checkImage = -1;

    private  int mMedia;

    // create a new word object

    public Word(String defaultTranslation, String miwokTranslation, int imageId,int mediaId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageId = imageId;
        mMedia = mediaId;
    }

    public Word(String defaultTranslation, String miwokTranslation,int mediaId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMedia = mediaId;
    }




    // get the default translation of word
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }


    // get the miwok translation for word
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageId() {
        return mImageId;
    }

    public boolean hasImage() {
        return mImageId != checkImage;
    }

    public int getmMedia() {
        return mMedia;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageId=" + mImageId +
                ", mMedia=" + mMedia +
                '}';
    }
}
