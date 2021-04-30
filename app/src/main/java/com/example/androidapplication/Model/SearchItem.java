package com.example.androidapplication.Model;

public class SearchItem {

    private int image;
    String text;

    public SearchItem(int image) {
        this.image = image;
    }

    public SearchItem(int image, String text) {
        this.image=image;
        this.text=text;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
