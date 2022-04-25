package kMid07_4;

public class Fan {
	String name;
	int admission;
	int stay;

	Fan(String name, int admission, int stay) {
		this.name = name;
		this.admission = admission;
		this.stay = stay;
	}

	// ===== ここから
	String info() {
		int h = 10 + (this.admission + this.stay) / 60;
		int m = (this.admission + this.stay) % 60;

		String time1 = "10時" + this.admission + "分";
		String time2 = h + "時" + m + "分";
		return this.name + " " + time1 + "～" + time2;
	}
	// ===== ここまで
}
