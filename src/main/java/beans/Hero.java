package beans;

public class Hero {

	private String title;
	private String power;

	// This is necessary for problem marshalling and unmarshalling of this POJO
	public Hero() {
	}

	public Hero(String title, String power) {
		this.title = title;
		this.power = power;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Hero [title=" + title + ", power=" + power + "]";
	}

}
