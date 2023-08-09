package ch05;

import starcraft.Marine;
import starcraft.Unit;
import starcraft.Zealot;
import starcraft.Zergling;

public class MainTest2 {

	public static void main(String[] args) {
		// Unit 이라는 배열에 저글링, 질럿, 마린을 담아 보세요
		// 실행도 시켜 봅시다.
		Zergling[] zergling1 = new Zergling[5];
		Zealot[] zealot1 = new Zealot[10];
		Marine[] marine1 = new Marine[7];
		
		zergling1[0] = new Zergling("저글링 1");
		zergling1[1] = new Zergling("저글링 2");
		zergling1[2] = new Zergling("저글링 3");
		zergling1[3] = new Zergling("저글링 4");
		zealot1[0] = new Zealot("질럿 1");
		zealot1[1] = new Zealot("질럿 2");
		zealot1[2] = new Zealot("질럿 3");
		zealot1[3] = new Zealot("질럿 4");
		zealot1[4] = new Zealot("질럿 5");
		marine1[0] = new Marine("마린 1");
		marine1[1] = new Marine("마린 2");
		marine1[2] = new Marine("마린 3");
		marine1[3] = new Marine("마린 4");
		marine1[4] = new Marine("마린 5");
		marine1[5] = new Marine("마린 6");
		marine1[6] = new Marine("마린 7");
		
		
		
		
		for(int i = 0; i < zergling1.length; i++) {
			if(zergling1[i] != null) {
				zergling1[i].showInfo();
				System.out.println();
			}
		}
		for(int i = 0; i < zealot1.length; i++) {
			if(zealot1[i] != null) {
				zealot1[i].showInfo();
				System.out.println();
			}
		}
		for(int i = 0; i < marine1.length; i++) {
			if(marine1[i] != null) {
				marine1[i].showInfo();
				System.out.println();
			}
		}
		
		
		
	}

}
