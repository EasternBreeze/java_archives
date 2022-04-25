package kMid09_3;

import java.util.HashMap;
import java.util.Map;

public class ScoreManager {

	private Map<String, Scores> map = new HashMap<>();

	void add(String name, int java, int db, int network, int web) {
		// ===== ここから
		map.put(name, new Scores());
		map.get(name).add(java);
		map.get(name).add(db);
		map.get(name).add(network);
		map.get(name).add(web);
		// ===== ここまで
	}

	String dataString(String name) {
		Scores s = map.get(name);
		String f = "%s 平均=%.2f 最低=%d 最高=%d";
		return String.format(f, name, s.average(), s.min(), s.max());
	}
}