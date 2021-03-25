package com.kao.animationsapplication.model;

public class MainItem {

    private int id;
    private int textStringId;

    public MainItem(int id, int textStringId) {
        this.id = id;
        this.textStringId = textStringId;
    }

    public void setTextStringId(int textStringId) {
        this.textStringId = textStringId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getTextStringId() {
        return textStringId;
    }
}
