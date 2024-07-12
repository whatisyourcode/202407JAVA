package java0712;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 입력: ");
		num = Integer.parseInt(scan.nextLine());
								// num : 학생 수, 3: 과목 수(국어,수학,평균)
		double scores[][] = new double[num][3];
		
		for(int i=0; i<num; i++) {
				System.out.println(i+"첫번쨰 학생");
				System.out.print("국어 점수: ");
				scores[i][0] = Double.parseDouble(scan.nextLine());
				
				System.out.print("수학 점수: ");
				scores[i][1] = Double.parseDouble(scan.nextLine());
				
				scores[i][2] = scores[i][0] + scores[i][1] / 2; // 평균
			}
		System.out.print("\t국어 \t수학 \t평균\n");	
		System.out.println("=============================");
		for (int i=0; i < scores.length; i++) {
			System.out.printf("%d번 학생\t%3.2f\t%3.2f\t%3.2f\n", i+1, scores[i][0], scores[i][1], scores[i][2]);
		}
		
		
		}
		
		
		
}

