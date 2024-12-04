package com.example.lab05;

public class phone {
    private int image;
    private String namephone;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNamephone() {
        return namephone;
    }

    public void setNamephone(String namephone) {
        this.namephone = namephone;
    }
    // Constructor

    public phone(int image , String namephone) {
        this.image = image;
        this.namephone = namephone;
    }
}
