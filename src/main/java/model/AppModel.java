package model;

public final class AppModel {
    private int x;

    public AppModel() {
        this.x = 0;
    }

    public AppModel(final int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "AppModel { " + "x = " + x + " }";
    }
}
