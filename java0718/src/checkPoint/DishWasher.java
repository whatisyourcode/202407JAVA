package checkPoint;

public class DishWasher extends HomeAppliancies {	
	@Override
	public void turnOn() {
		System.out.println("식기 세척기 켜기");
	}
	
	@Override
	public void turnOff() {
		System.out.println("식기 세척기 끄기");
	}
}
