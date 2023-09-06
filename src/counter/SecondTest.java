package counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import alarmklocka.CircularCounter.Direction;

class SecondTest {

	@Test
	void test() {
		SecondCounter secondC = new SecondCounter();
		
		for(int k = 0; k < 63; k++) {
			secondC.count();
			System.out.println(secondC.getCount());
		}
		
		for(int i = 0; i < 5; i++) {
			secondC.count();
			secondC.count();

			System.out.println(secondC.getCount());
			secondC.pause();
			
		}
		
		for(int j = 0; j < 5; j++) {
			secondC.resume();
			secondC.count();
			System.out.println(secondC.getCount());
			
		}
		secondC.reset();
		System.out.println(secondC.getCount());
		
		SecondCounter secondCDec = new SecondCounter(Direction.DECREASING);
		
		for(int p = 0; p<65;p++) {
			secondCDec.count();
			System.out.println(secondCDec.getCount());
		}
		
		assertEquals(54,secondCDec.getCount());

	}

}
