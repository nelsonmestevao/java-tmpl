package model;

public class AppModel {
    private int x;

    public AppModel(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "AppModel { " +
                "x = " + x +
                " }";
    }
}
