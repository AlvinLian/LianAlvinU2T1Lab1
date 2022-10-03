public class Point {

    // instance variables
    private int x;
    private int y;

    // constructor that sets instance variables x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // constructor that sets both x and y to an integer argument
    public Point(int num) {
        x = num;
        y = num;
    }

    // constructor that as no parameters and sets both x and y to 0
    public Point() {
        x = 0;
        y = 0;
    }

    // "getter" method that returns x
    public int getX() {
        return x;
    }

    // "getter" method that returns y
    public int getY() {
        return y;
    }

    // "setter" method that sets x to user's new integer
    public void setX(int newX) {
        x = newX;
    }

    // "setter" method that sets y to user's new integer
    public void setY(int newY) {
        y = newY;
    }

    // method that returns x and y in coordinate format as a String
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    // method that returns quadrant of a point
    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if (x == 0 && y == 0) {
            return "origin";
        } else {
            return "on an axis";
        }
    }

}
