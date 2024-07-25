package java0725;

import java.util.Objects;

public class Key {
	public int number;

	public Key(int number) {
		super();
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key ck = (Key) obj;
			if (number == ck.number) {
				return true;
			}		
		}
		return false;
	}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
		//	return number;
			return Objects.hash(number);
		}
	
	
	
}
