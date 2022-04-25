package q11_block_stack;

import q11_block_stack.Field.Block;

public final class Main {

	public static void main(String[] args) {
		Field f1 = new Field(7, 7);
		f1.stackBlocks(Block.I, 5);

		Field f2 = new Field(10, 7);
		f2.stackBlocks(Block.T, 5);

		Field f3 = new Field(10, 7);
		f3.stackBlocks(Block.Z, 5);
	}

}
