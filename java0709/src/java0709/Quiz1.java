package java0709;


/**
 * swap 예제 클래스
 */
public class Quiz1 {

	/**
	 * @param x
	 * @param y
	 * since 1.0
	 */
	public static void swap(int x,int y)
	{
		int temp = x;
		x = y;
		y = x;
		
		System.out.printf("x=%d y=%d\n", x ,y);
	}
	/**
	 * @param args
	 * since 1.0
	 */
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int temp = 0;
		
		System.out.printf("x=%d y=%d\n", x ,y);
		swap(x,y);
		
//		System.out.println("x=" + x + " y=" + y);
	}
	


}
