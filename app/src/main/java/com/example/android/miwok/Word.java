package com.example.android.miwok;

/**
 * Created by jaemin on 17. 1. 15.
 */

public class Word {

    private String defaultTranslation;
    private String mMiworkTranslation;

    public Word(String defaultTranslation, String mMiworkTranslation){
        this.defaultTranslation = defaultTranslation;
        this.mMiworkTranslation = mMiworkTranslation;
    }

    /**
     * Getter and Setter
     * @return
     */
    public String getmMiworkTranslation() {
        return mMiworkTranslation;
    }

    public void setmMiworkTranslation(String mMiworkTranslation) {
        this.mMiworkTranslation = mMiworkTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

}
