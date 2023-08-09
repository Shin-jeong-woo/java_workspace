package starcraft;

public class MainTest {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("질럿");
		Marine marine1 = new Marine("마린");
		Zergling zergling1 = new Zergling("저글링");

		zealot1.attack(marine1);
		zealot1.attack(zergling1);

		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();

	}

}
