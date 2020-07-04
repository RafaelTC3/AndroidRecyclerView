package com.study.recyclerview.model;

public class Post {

    private String title;
    private String quantity;
    private int image;

    public Post() {}

    public Post(String title, String quantity, int image) {
        this.title = title;
        this.quantity = quantity;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
