package chapter_02;

public class Apple {

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Apple(String color) {
        this.color = Color.valueOf(color);
    }


}
