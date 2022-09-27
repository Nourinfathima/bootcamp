package com.food.nest;

public class Food {
    int dosa;
    int cake;
    int juice;

    public Food(int dosa, int cake, int juice) {
        this.dosa = dosa;
        this.cake = cake;
        this.juice = juice;
    }

    public int getDosa() {
        return dosa;
    }

    public void setDosa(int dosa) {
        this.dosa = dosa;
    }

    public int getCake() {
        return cake;
    }

    public void setCake(int cake) {
        this.cake = cake;
    }

    public int getJuice() {
        return juice;
    }

    public void setJuice(int juice) {
        this.juice = juice;
    }
}
