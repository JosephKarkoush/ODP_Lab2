package counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import alarmklocka.CircularCounter.Direction;

class HourTest {

	@Test
	void test() {
		HourCounter hourC = new HourCounter();
		
		for(int k = 0; k < 25; k++) {
			hourC.count();
			System.out.println(hourC.getCount());
		}
		
		for(int i = 0; i < 5; i++) {
			hourC.count();
			hourC.count();

			System.out.println(hourC.getCount());
			hourC.pause();
			
		}
		
		for(int j = 0; j < 5; j++) {
			hourC.resume();
			hourC.count();
			System.out.println(hourC.getCount());
			
		}
		hourC.reset();
		System.out.println(hourC.getCount());
		
		
		HourCounter hourCDec = new HourCounter(Direction.DECREASING);
		
		for(int p = 0; p<24;p++) {
			hourCDec.count();
			System.out.println(hourCDec.getCount());
		}
		
		assertEquals(23,hourCDec.getCount());
	}

}
