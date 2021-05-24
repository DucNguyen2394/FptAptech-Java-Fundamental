package tutorial;

public class AccessModifiers {

	public static void main(String args[]){
		// inner class phải truy cập thế này.
		AccessModifiers person = new AccessModifiers();
		AccessModifiers.Person per = person.new Person();
		
		per.name = "anh đức";
		per.setVisaCard("121241");
		
		System.out.println("Name: " + per.name);
		System.out.println("Visa: " + per.getVisaCard());
		per.showVisa();
	}
	
	public class Person{
		public String name;
		private String visaCard;
		
		public Person(){
			
		}
		
		public Person(String name, String visaCard) {
			this.name = name;
			this.visaCard = visaCard;
		}
		
		public String getVisaCard() {
			return visaCard;
		}

		public void setVisaCard(String visaCard) {
			this.visaCard = visaCard;
		}

		public void showVisa(){
			System.out.println("Your card: " + this.visaCard);
		}
	}
	
}
