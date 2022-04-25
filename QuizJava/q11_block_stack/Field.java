package q11_block_stack;

import java.util.Random;

final class Field {

	enum Block {
		I(3, new RC(0, 0), new RC(0, 1), new RC(0, 2)), //
		T(4, new RC(0, 0), new RC(0, 1), new RC(0, 2), new RC(1, 1)), //
		Z(3, new RC(0, 0), new RC(0, 1), new RC(1, 1), new RC(1, 2));

		final int width;
		final RC[] positions;

		Block(int length, RC... positions) {
			this.width = length;
			this.positions = positions;
		}
	}

	private static class RC {
		final int row;
		final int col;

		RC(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	private static final Random rand = new Random();

	private final int[][] field;

	Field(int row, int col) {
		field = new int[row][col];
	}

	void stackBlocks(Block type, int volume) {
		for (int i = 1; i <= volume; i++) {
			RC anchor = new RC(0, rand.nextInt(field[0].length - type.width + 1));

			while (canDrop(type, anchor)) {
				anchor = new RC(anchor.row + 1, anchor.col);
			}
			setBlock(type, anchor, i);
			// System.out.println(this);
		}
		System.out.println(this);
	}

	private boolean canDrop(Block type, RC anchor) {
		for (RC pos : type.positions) {
			int nextRow = anchor.row + pos.row + 1;
			if (nextRow >= field.length) {
				return false;
			}

			if (field[nextRow][anchor.col + pos.col] != 0) {
				return false;
			}
		}
		return true;
	}

	private void setBlock(Block type, RC anchor, int number) {
		for (RC pos : type.positions) {
			field[anchor.row + pos.row][anchor.col + pos.col] = number;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int[] rows : field) {
			sb.append("■");
			for (int n : rows) {
				sb.append(n == 0 ? "  " : String.format("%2d", n));
			}
			sb.append("■\n");
		}
		for (int i = 0; i < field[0].length + 2; i++) {
			sb.append("■");
		}

		return sb.toString();
	}
}
