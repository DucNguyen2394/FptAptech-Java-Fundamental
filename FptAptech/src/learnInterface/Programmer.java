package learnInterface;

public class Programmer implements Human,Recruiment {

	@Override
	public boolean interview(boolean select) {
		return false;
	}

	@Override
	public boolean screening(int score) {
		return false;
	}

	@Override
	public void learn() {
		System.out.println("I learning java");
	}

	@Override
	public void work() {
		System.out.println("I working at home");
	}

}
