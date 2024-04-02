package com.example.marketapp;

public class Item {
    int itemImg;
    String itemName, istemDisc;

    public Item(int itemImg, String itemName, String istemDisc) {
        this.itemImg = itemImg;
        this.itemName = itemName;
        this.istemDisc = istemDisc;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getIstemDisc() {
        return istemDisc;
    }

    public void setIstemDisc(String istemDisc) {
        this.istemDisc = istemDisc;
    }
}
