package q19_slash_maze;

enum Road {
	L("＼", new Move[] { Move.DOWN, Move.UP, Move.RIGHT, Move.LEFT, //
			Move.RIGHT_DOWN, Move.LEFT_UP }), //
	R("／", new Move[] { Move.DOWN, Move.UP, Move.RIGHT, Move.LEFT, //
			Move.LEFT_DOWN, Move.RIGHT_UP }); //

	final String mark;
	final Move[] canMoveDir;

	Road(String mark, Move[] canMoveDir) {
		this.mark = mark;
		this.canMoveDir = canMoveDir;
	}

	@Override
	public String toString() {
		return mark;
	}
}

enum Move {
	DOWN(0, 1, false), UP(0, -1, false), RIGHT(1, 0, false), LEFT(-1, 0, false), //
	RIGHT_DOWN(1, 1, true), LEFT_DOWN(-1, 1, true), //
	RIGHT_UP(1, -1, true), LEFT_UP(-1, -1, true);//

	final int dx;
	final int dy;
	final boolean isMoveSlant;

	Move(int dx, int dy, boolean isMoveSlant) {
		this.dx = dx;
		this.dy = dy;
		this.isMoveSlant = isMoveSlant;
	}
}