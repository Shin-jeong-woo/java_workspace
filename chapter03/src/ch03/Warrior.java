package ch03;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name,hp);
	}
	
	
	public void comboAttack() {
		System.out.println("전사가 2단 공격을 합니다.");
	}
	
	@Override
	public void attack() {
		System.out.println(name + "이 기본 공격을 합니다.");
	}

}
