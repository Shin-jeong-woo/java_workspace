package ch03;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}
	
	public void freezing() {
		System.out.println("얼음 공격을 합니다.");
	}
	
	@Override
	public void attack() {
		System.out.println(name + "이 기본 공격을 합니다.");
	}
}
