package e2;

import java.util.*;

public class Grid {
    final private int size;
    private List<Cell> cells = new ArrayList<>();
    private final Random random = new Random();

    private final Set<Pair<Integer,Integer>> mines = new HashSet<>();

    public Grid(int size) {
        this.size = size;
    }

    public void setGrid(int minesNumber) {
        this.placeMinesRandomly(minesNumber);
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (mines.contains(new Pair<>(i,j))) {
                    cells.add(new Cell(new Pair<>(i, j), -1));
                } else {
                    cells.add(new Cell(new Pair<>(i,j), adjacentMines(mines, new Pair<>(i,j))));
                }
            }
        }

    }

    private int adjacentMines(Set<Pair<Integer,Integer>> mines, Pair<Integer,Integer> currentPosition) {
        int adjacentMines = 0;
        for (int i = currentPosition.getX() - 1; i < currentPosition.getX() + 2; i++) {
            for (int j = currentPosition.getY() - 1; j < currentPosition.getY() + 2; j++) {
                if (mines.contains(new Pair<>(i,j))) {
                    adjacentMines++;
                }
            }
        }
        return adjacentMines;
    }

    private void placeMinesRandomly(int minesNumber) {
        for (int i = 0; i < minesNumber; i++) {
            this.mines.add(randomEmptyPosition());
        }
    }

    private Pair<Integer, Integer> randomEmptyPosition() {
        Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(this.size), this.random.nextInt(this.size));
        return this.mines.contains(pos) ? randomEmptyPosition() : pos;
    }
    public Set<Pair<Integer, Integer>> getMines() {
        return this.mines;
    }
    public int getCellValue(Pair<Integer, Integer> position) {
        int value = -2;
        for (Cell cell : cells) {
             if (cell.getPosition().equals(position)) {
                 value = cell.getValue();
             }
        }
        return value;
    }



}
