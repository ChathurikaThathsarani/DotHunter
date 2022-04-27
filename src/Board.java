
import java.util.Random;

public class Board {
	String dot;
	Hunter myhunter;
	soldier[] threeSoldiers;
	int dotCount = 97;
	int superDotCount = 3;

	public Board(String dot, Hunter myhunter, soldier[] threeSoldiers) {
		this.dot = dot;
		this.myhunter = myhunter;
		this.threeSoldiers = threeSoldiers;
		init();
	}

	public String getDot() {
		return dot;
	}

	public void setDot(String dot) {
		this.dot = dot;
	}

	public soldier[] getThreeSoldiers() {
		return threeSoldiers;
	}

	public void setThreeSoldiers(soldier[] threeSoldiers) {
		this.threeSoldiers = threeSoldiers;
	}

	public void init() {
		myhunter.setxPOS(0);
		myhunter.setYPOS(0);
		Random random = new Random();
		for (int i = 0; i < 3; ++i) {
			threeSoldiers[i].setXPOS(random.nextInt(999));
			threeSoldiers[i].setYPOS(random.nextInt(999));
		}
		System.out.println("Board is ready and three soldiers and the hunter is positioned in the board");
	}

}
