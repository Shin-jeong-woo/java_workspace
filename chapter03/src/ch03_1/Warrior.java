package ch03_1;

public class Warrior extends Hero {

	// !! 부모 클래스에 사용자 정의 생성자가 있다면
	// 자식 클래스에서 반드시 부모 생성자를 먼저 호출 해야한다.
	public Warrior(String name, int hp) {
		// super <-- 부모를 의미한다.
		super(name, hp); // 부모 생성자를 먼저 호출 해야한다.
		
	}

	public void comboAttack() {
		System.out.println("전사가 2단 공격을 합니다");
	}
	
	// 상속에서 오버라이드
	@Override // 어노테이션
	protected void attack() {
		// super.attack();
		System.out.println(super.name + "이 기본 공격을 합니다.");
	}
		
}
	

