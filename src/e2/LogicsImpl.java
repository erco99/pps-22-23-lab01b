package e2;

public class LogicsImpl implements Logics {

    private final int size;
    private final int minesNumber;

    private Grid grid;

    public LogicsImpl(int size, int minesNumber) {
        this.size = size;
        this.minesNumber = minesNumber;
    }


    @Override
    public int getMinesNumber() {
        return this.minesNumber;
    }

    @Override
    public void setGrid() {
        grid = new Grid(this.size);
        grid.setGrid(this.minesNumber);
    }

    @Override
    public boolean hit(Pair<Integer, Integer> position) {
        return this.grid.getMines().contains(position);
    }
    @Override
    public Grid getGrid() {
        return grid;
    }

    @Override
    public boolean hasWon(Pair<Integer, Integer> position) {
        return false;
    }
}
