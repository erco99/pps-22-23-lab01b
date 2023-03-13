package e2;

public class Cell {
    private Pair<Integer, Integer> position;
    private int value;
    private boolean clicked;

    public Cell(Pair<Integer, Integer> position, int value) {
        this.position = position;
        this.value = value;
        this.clicked = false;
    }
    public Pair<Integer, Integer> getPosition() {
        return position;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isClicked() {
        return this.clicked;
    }
}
