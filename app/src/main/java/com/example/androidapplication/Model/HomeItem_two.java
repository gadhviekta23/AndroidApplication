package com.example.androidapplication.Model;

public class HomeItem_two {
    int image;
    String title;
    int like;
    int setting;
    String line_number;

    public HomeItem_two(int image, String title, int like, String line_number ,int setting) {
        this.image = image;
        this.title = title;
        this.like = like;
        this.setting = setting;
        this.line_number = line_number;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getLine_number() {
        return line_number;
    }

    public void setLine_number(String line_number) {
        this.line_number = line_number;
    }

    public int getSetting() {
        return setting;
    }

    public void setSetting(int setting) {
        this.setting = setting;
    }
}
