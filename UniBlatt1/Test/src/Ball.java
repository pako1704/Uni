
public class Ball {
	private float diameter;
	private int weight;
	private float xPos;
	private float yPos;

	Ball(float dia, int wei, float x, float y) {
		this.diameter = dia;
		this.weight = wei;
		this.xPos = x;
		this.yPos = y;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float dia) {
		this.diameter = dia;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int wei) {
		this.weight = wei;

	}

	public float getXPos() {
		return xPos;
	}

	public void setXPos(float x) {
		this.xPos = x;
	}

	public float getYPos() {
		return yPos;
	}

	public void setYPos(float y) {
		this.yPos = y;
	}
	public void printAll(){
		System.out.println(this.getDiameter());
		System.out.println(this.getWeight());
		System.out.println(this.getXPos());
		System.out.println(this.getYPos());
	}
}
