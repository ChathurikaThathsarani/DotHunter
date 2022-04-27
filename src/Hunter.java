
public class Hunter {
	private String name;
	private String color;
	private int xPOS;
	private int YPOS;

	public Hunter(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getxPOS() {
		return xPOS;
	}

	public void setxPOS(int xPOS) {
		this.xPOS = xPOS;
	}

	public int getYPOS() {
		return YPOS;
	}

	public void setYPOS(int YPOS) {
		this.YPOS = YPOS;
	}

	void move(Hunter h) {
		System.out.println("Hunter is moving, X:" + h.xPOS + " Y:" + h.YPOS);

		try {
			if (h.xPOS == 250 && h.YPOS == 360)
				throw new SoundException();

		} catch (SoundException e) {

			System.out.println("Oh oo!!");
		}

	}

	void hunt(Board b) {
		if (b.getDot() == "superDot") {
			b.superDotCount = b.superDotCount - 1;
			System.out.println("Hunting super dots");
		}

		else if (b.getDot() == "Dot") {
			b.dotCount = b.dotCount - 1;
			System.out.println("Hunting dots");
		}

		if (b.superDotCount == 0 && b.dotCount == 0) {
			System.out.println("You win! Game Over");
		}

	}
}
