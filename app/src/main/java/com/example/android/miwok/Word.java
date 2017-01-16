package com.example.android.miwok;

/**
 * Created by jaemin on 17. 1. 15.
 */

public class Word {

    private String defaultTranslation;
    private String mMiworkTranslation;
    private Integer imageResource;

    public Word(String defaultTranslation, String mMiworkTranslation, Integer imageResource) {
        this.defaultTranslation = defaultTranslation;
        this.mMiworkTranslation = mMiworkTranslation;
        this.imageResource = imageResource;

    }

    public Integer getImageResource() {
        return imageResource;
    }

    public void setImageResource(Integer imageResource) {
        this.imageResource = imageResource;
    }



    public Word(String defaultTranslation, String mMiworkTranslation){
        this.defaultTranslation = defaultTranslation;
        this.mMiworkTranslation = mMiworkTranslation;
        imageResource=-1;
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

    public boolean hasImage(){
        int NO_IMAGE_PROVIDED = -1;
        return imageResource != NO_IMAGE_PROVIDED;
    }
}
