package java0709;

import java.util.Scanner;

public class Score {
	
	public static int getScore(String msg,Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine(); 
		int score = Integer.parseInt(input);
		if(score > 100 | score < 0) {
			System.out.println("성적을 잘못 입력했습니다( 0 점 ~ 100점 사이 )");
			return 0;
		}
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		
		
		Scanner sc = new Scanner(System.in);
		score = getScore("성적 입력 : ", sc);
		
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}
		
	}

}
