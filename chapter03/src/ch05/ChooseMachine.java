package ch05;

public class ChooseMachine {

	String name;
	int price;
	
	public ChooseMachine(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("뽑은 상품은 " + name);
		System.out.println("가격은 " + price);
	}
}
