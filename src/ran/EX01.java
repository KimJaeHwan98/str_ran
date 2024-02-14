package ran;

import java.util.Random;

public class EX01 {
public static void main(String[] args) {
	for(int i= 0;i<5;i++) {
		System.out.println(Math.random());
	}
	System.out.println("-----------");
	
		for(int i= 0;i<5;i++) {
			double dou = Math.random() * 3; //3을 곱하면 0~2 값을 랜덤으로 가져온다
			System.out.println((int)dou);
		}
		System.out.println("=======");
		Random r = new Random();
		for(int i=0;i<5;i++) {
			int num = r.nextInt(3); // 0~2
			System.out.println(num);
		}
		
	}
}
