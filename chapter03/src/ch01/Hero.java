package ch01;

public class Hero {

	String name;
	int power;
	int level;
	int hp;
	
	public static void main(String[] args) {
		
		Archer archer1 = new Archer();
		archer1.dex = 20;
		archer1.power = 30;
		System.out.println(archer1.dex);
		System.out.println(archer1.power);
	}
}

class Warrior extends Hero{
	int str;
}

class Archer extends Hero{
	int dex;
}

class Wizard extends Hero{
	int wis;
}



