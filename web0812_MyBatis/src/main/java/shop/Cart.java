package shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter 
@ToString
public class Cart {
	private int id;
	private int product_id;
	private int quantity;
}
