package e1_final;

public class Knight {

    private Pair<Integer, Integer> position;
    public Knight(final Pair<Integer,Integer> position) {
        this.position = position;
    }

    public void move(Pair<Integer,Integer> newPosition) {
        this.position = newPosition;
    }

    public Pair<Integer, Integer> getPosition() {
        return position;
    }

    public boolean canMove(int row, int col) {
        int x = row-this.position.getX();
        int y = col-this.position.getY();
        if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
            return true;
        } else {
            return false;
        }
    }
}
