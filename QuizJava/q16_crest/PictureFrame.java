package q16_crest;

import java.util.Random;

final class PictureFrame {

	enum Tile {
		A(new P[] { P.P1, P.P0, P.P0, P.P1 }), //
		B(new P[] { P.P0, P.P2, P.P2, P.P0 }), //
		W0(new P[] { P.P0, P.P0, P.P0, P.P0 }), //
		W1(new P[] { P.P1, P.P0, P.P0, P.P0 }), //
		W2(new P[] { P.P0, P.P2, P.P0, P.P0 }), //
		W3(new P[] { P.P0, P.P0, P.P0, P.P1 }), //
		W4(new P[] { P.P0, P.P0, P.P2, P.P0 });

		final P[] panels;

		Tile(P[] panels) {
			this.panels = panels;
		}
	}

	enum P {
		P0("　"), P1("／"), P2("＼");

		final String type;

		P(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return type;
		}
	}

	private static final Random rand = new Random();

	private final Tile[][] tiles;

	PictureFrame() {
		tiles = new Tile[6][6];

		for (int i = 0; i < tiles.length; i++) {
			for (int j = 0; j < tiles[0].length; j++) {
				tiles[i][j] = getTile(i, j);
			}
		}
	}

	private Tile getTile(int r, int c) {
		if ((r == 0 || r == 5) && (c == 0 || c == 5)) {
			return Tile.W0;
		}
		if (r == 5 && c % 2 == 0 || //
				r % 2 == 0 && c == 5) {
			return Tile.W1;
		}
		if (r % 2 == 0 && c == 0 || //
				r == 5 && c % 2 == 1) {
			return Tile.W2;
		}
		if (r == 0 && c % 2 == 1 || //
				r % 2 == 1 && c == 0) {
			return Tile.W3;
		}
		if (r == 0 && c % 2 == 0 || //
				r % 2 == 1 && c == 5) {
			return Tile.W4;
		}

		return rand.nextBoolean() ? Tile.A : Tile.B;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Tile[] rows : tiles) {
			StringBuilder buffer = new StringBuilder();

			for (Tile t : rows) {
				P[] p = t.panels;

				sb.append(p[0]);
				sb.append(p[1]);
				buffer.append(p[2]);
				buffer.append(p[3]);
			}
			sb.append("\n");
			sb.append(buffer.toString());

			sb.append("\n");
		}
		return sb.toString();
	}

}
