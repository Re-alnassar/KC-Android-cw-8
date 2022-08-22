package com.example.cw_7;

import java.io.Serializable;

public class Paintings  implements Serializable {

    private String paintingName;
    private int paintingImage;
    private int paintingPrice;

    public String getPaintingName() {
        return paintingName;
    }

    public void setPaintingName(String paintingName) {
        this.paintingName = paintingName;
    }

    public int getPaintingImage() {
        return paintingImage;
    }

    public void setPaintingImage(int paintingImage) {
        this.paintingImage = paintingImage;
    }

    public int getPaintingPrice() {
        return paintingPrice;
    }

    public void setPaintingPrice(int paintingPrice) {
        this.paintingPrice = paintingPrice;
    }

    public Paintings(String paintingName, int paintingImage, int paintingPrice) {
        this.paintingName = paintingName;
        this.paintingImage = paintingImage;
        this.paintingPrice = paintingPrice;


    }
}
