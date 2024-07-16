package java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Cat {
	private String breed;
	private String color;
	private int age;	
	
//	public Cat(){	// Default Constructor
//		System.out.println("Cat()");
//	}
//	
//	Cat(int age){ // Constructor
//	}
//	
//	
//	public Cat(String breed) {
////		super();
//		this(breed,"흰색",10); // this() 나 super()
//	}
//
//	public Cat(String breed, String color) {
////		super();
////		this.breed = breed;
////		this.color = color;
//		this(breed,color,10);
//	}
//
//
//	public Cat(String breed, String color, int age) {
//		super();
//		this.breed = breed;
//		this.color = color;
//		if(age > 9) {
//			this.age = age;
//		}else {
//			this.age = 10;
//		}
//	}
//	


	
	
}
