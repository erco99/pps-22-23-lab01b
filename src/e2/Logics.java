package e2;

public interface Logics {

    /**
     * @return
     */
    int getMinesNumber();

    /**
     *
     * sets the grid inserting mines and values on each cell
     *
     */
    void setGrid();

    /**
     * implements the logic of clicking a cell
     *
     * @param position
     * @return whether the clicked cell contains a mine or not
     */
    boolean hit (Pair<Integer,Integer> position);


    /**
     * gets the grid with the cells inside
     *
     * @return the grid
     */
    Grid getGrid();

    /**
     * checks if the player has won by clicking the cell
     *
     * @param position
     * @return whether the player has won or not
     */
    boolean hasWon (Pair<Integer, Integer> position);
}
