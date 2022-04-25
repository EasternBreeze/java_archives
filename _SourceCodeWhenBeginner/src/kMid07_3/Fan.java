package kMid07_3;

public class Fan {
	int admission;
	int stay;

	Fan(int admission, int stay) {
		this.admission = admission;
		this.stay = stay;
	}

	// ===== ここから
	boolean exist(int minute) { // minute = 0~59
		return minute >= this.admission && minute < this.admission + this.stay;
	}
	// ===== ここまで
}
