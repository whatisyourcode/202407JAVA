package checkPoint;

public class Freezer extends HomeAppliancies {
	@Override
	public void turnOn() {
		System.out.println("냉동고 켜기");
	}
	
	@Override
	public void turnOff() {
		System.out.println("냉동고 끄기");
	}

}
