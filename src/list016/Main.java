package list016;

public class Main {

	public static void main(String[] args) {
		Male male = new Male("Gabbe", 20);
		Female female = new Female("Sofia", 30);
		OtherGender otherGender = new OtherGender("LoveMelissa", 18);
		
		male.printClassName();
		female.printClassName();
		otherGender.printClassName();
	}
}