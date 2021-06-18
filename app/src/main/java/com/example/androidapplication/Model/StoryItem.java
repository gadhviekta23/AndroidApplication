package com.example.androidapplication.Model;

public class StoryItem {
    int image;
    int image_one;
    int image_two;
    String text;

    public StoryItem(int image, int image_one ,int image_two,String text) {
        this.image=image;
        this.image_one=image_one;
        this.image_two=image_two;
        this.text=text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage_one() {
        return image_one;
    }

    public void setImage_one(int image_one) {
        this.image_one = image_one;
    }

    public int getImage_two() {
        return image_two;
    }

    public void setImage_two(int image_two) {
        this.image_two = image_two;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
