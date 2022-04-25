package q14_secret_eden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SecretEden {

	public static void main(String[] args) {
		FlowerBed bed = new FlowerBed(13, true, true, false, true);
		//	 FlowerBed bed = new FlowerBed(13, true, true, false, false, false, true);
		bed.timelapse();
	}
}

final class FlowerBed {
	private final int end;

	private List<Boolean> bed;
	private int generation = 1;
	private int dead;

	FlowerBed(int end, Boolean... bed) {
		this.end = end;
		this.bed = new ArrayList<>(Arrays.asList(bed));
	}

	void timelapse() {
		System.out.println(this);
		while (generation < end) {
			nextGeneration();
			generation++;
			System.out.println(this);
		}
	}

	private void nextGeneration() {
		List<Boolean> next = new ArrayList<>();

		bed.add(0, false);
		bed.add(false);

		next.add(true);
		for (int i = 1; i < bed.size() - 1; i++) {
			next.add(isBloom(bed.get(i - 1), bed.get(i), bed.get(i + 1)));
		}
		next.add(true);

		bed = next;
	}

	private boolean isBloom(boolean left, boolean mid, boolean right) {
		boolean isBloom = left ^ right;

		if (mid && !isBloom) {
			dead++;
		}
		return isBloom;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("第%2d世代 (合計%d本枯れた)\n", generation, dead));
		for (int i = generation; i < end; i++) {
			sb.append("　");
		}

		for (boolean b : bed) {
			sb.append(b ? "◎" : "×");
		}
		sb.append("\n");
		return sb.toString();
	}
}