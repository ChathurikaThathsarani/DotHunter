
abstract public class soldier {
	private int XPOS;
	private int YPOS;

	abstract public void hunt();

	public int getXPOS() {
		return XPOS;
	}

	public void setXPOS(int POS) {
		this.XPOS = POS;
	}

	public int getYPOS() {
		return YPOS;
	}

	public void setYPOS(int YPOS) {
		this.YPOS = YPOS;
	}

	public void status() {
		System.out.println("Game over");
	}

}
