package kMid09_3;

public class Q3 {
	
	public static void main(String[] args) {
		ScoreManager sm = new ScoreManager();
		sm.add("野比", 25, 45, 55, 40);
		sm.add("骨川", 70, 60, 85, 70);
		sm.add("剛田", 65, 35, 70, 95);
		sm.add("出木杉", 75, 80, 100, 95);
		
		System.out.println("<<集計結果>>");
		System.out.println(sm.dataString("野比"));
		System.out.println(sm.dataString("骨川"));
		System.out.println(sm.dataString("剛田"));
		System.out.println(sm.dataString("出木杉"));
	}
}