package e1_final;

import java.util.Random;

public class LogicsImpl implements Logics {
	
	private final Pawn pawn;
	private final Knight knight;
	private final Random random = new Random();
	private final int size;
	 
    public LogicsImpl(int size){
    	this.size = size;
        this.pawn = new Pawn(this.randomEmptyPosition());
        this.knight = new Knight(this.randomEmptyPosition());
    }
    
	private final Pair<Integer,Integer> randomEmptyPosition(){

    	Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
    	// the recursive call below prevents clash with an existing pawn
    	return this.pawn!=null && this.pawn.equals(pos) ? randomEmptyPosition() : pos;
    }
    
	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		// Below a compact way to express allowed moves for the knight
		int x = row-this.knight.getPosition().getX();
		int y = col-this.knight.getPosition().getY();
		if (this.knight.canMove(row, col)) {
			this.knight.move(new Pair<>(row,col));
			return this.pawn.equals(this.knight.getPosition());
		}
		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.equals(new Pair<>(row,col));
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.equals(new Pair<>(row,col));
	}
}
