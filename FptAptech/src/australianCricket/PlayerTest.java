package australianCricket;

public class PlayerTest extends Player {
	
	float income;
	float bonus;
	
	Player player = new Player();

	public float getIncome() {
		return income;
	}

	public void setIncome(float income) {
		this.income = income;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "PlayerTest [income=" + income + ", bonus=" + bonus + ", player=" + player + "]";
	}
	
	
}
