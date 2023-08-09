package ch05;

import java.util.Random;

public class MachineMainTest {

	public static void main(String[] args) {
		
		Random random = new Random();
		int selected = random.nextInt(10)+1;
		
		ChooseMachine[] choose = new ChooseMachine[10];

		choose[0] = new Doll("곰인형",4_000);
		choose[1] = new Phone("아이폰",500_000);
		choose[2] = new Doll("강아지인형",3_000);
		choose[3] = new Whiskey("위스키",100_000);
		choose[4] = new Phone("갤럭시",400_000);
		choose[5] = new Doll("사자인형",8_000);
		choose[6] = new Whiskey("보드카",80_000);
		choose[7] = new Doll("고양이인형",10_000);
	
		for (int i = 0; i < choose.length; i++) {

			if(choose[i] != null)
				choose[i].showInfo();
		}
		System.out.println(choose[selected]);
	}

	
}
