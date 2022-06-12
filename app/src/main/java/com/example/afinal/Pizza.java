package com.example.afinal;

public class Pizza {
    private String name;
    private int imageID;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.pizza1),
            new Pizza("Funghi", R.drawable.pizza2),

    };
    private Pizza(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

}

