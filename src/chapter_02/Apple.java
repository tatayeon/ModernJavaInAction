public class Apple {
    public enum Color {
        RED, GREEN, BLUE
    }

    private Color color;
    private int weight;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
