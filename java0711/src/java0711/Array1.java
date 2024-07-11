package java0711;

public class Array1 {

	public static void main(String[] args) {
		int scores[] = {83,90,87};
		int scores2[] = new int[] {83,90,87};
		double sum = 0;
		double avg = 0.0;

//		System.out.println(scores[4]);  // indexOutOf Exception
		
		for(int i=0; i< scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// 총점

		for(int i=0; i< scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총점 : " + sum);
		
		// 평균
		avg = sum / scores.length;
		System.out.println("평균 : " + avg);
		
		
		int[] myArr = new int[5];
	
		for(int i=0; i<myArr.length; i++) {
			System.out.println(myArr[i]); 
		}
		
		double[] myArr2 = new double[5];
		
		for(int i=0; i<myArr2.length; i++) {
			System.out.println(myArr2[i]); 
		}
		
		boolean[] myArr3 = new boolean[5];
		
		for(int i=0; i<myArr3.length; i++) {
			System.out.println(myArr3[i]); 
		}
	}

}
