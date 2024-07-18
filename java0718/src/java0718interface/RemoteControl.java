package java0718interface;

public interface RemoteControl {
	static final int MAX = 10;
	int MIN = 0; // 자동으로 public static final으로 인식.
	
	public abstract void doInt();
}
