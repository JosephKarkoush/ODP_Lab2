package counter;

public interface CounterType {
	
	void count();
	
	void reset();
	
	int getCount();
	
	void pause();
	
	void resume();
	
	void setCurrentCount();
	
	String toString();

	public void setCurrentCount(int newCurrentCount);
	
	

}
