

public class Ball {

    private int bX, bY;
    public int speed = 1;

    public int Sin (int radius, double angle) {
        this.bY = (int) (radius * Math.sin(angle * Math.PI / 180));
        return bY;
    }
    public int Cos (int radius, double angle) {
        this.bX = (int) (radius * Math.cos(angle * Math.PI / 180));
        return bX;
    }

    public int getbX() {
        return bX;
    }

    public int getbY() {
        return bY;
    }


}
