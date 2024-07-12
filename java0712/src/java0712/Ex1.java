package java0712;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lottos = new int[6];
		Random rd = new Random();
		for(int i=0; i<6; i++) { 
			lottos[i] = rd.nextInt() ;
		}
		for(int i=0; i<6; i++) {
			System.out.println(lottos[i]);
		}
		
		/*
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		*/
	}

}
