package counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import alarmklocka.CircularCounter.Direction;

class MinuteTest {

	@Test
	void test() {
		MinuteCounter minuteC = new MinuteCounter();
		
		for(int k = 0; k < 63; k++) {
			minuteC.count();
			System.out.println(minuteC.getCount());
		}
		
		for(int i = 0; i < 5; i++) {
			minuteC.count();
			minuteC.count();

			System.out.println(minuteC.getCount());
			minuteC.pause();
			
		}
		
		for(int j = 0; j < 5; j++) {
			minuteC.resume();
			minuteC.count();
			System.out.println(minuteC.getCount());
			
		}
		minuteC.reset();
		System.out.println(minuteC.getCount());
		
		
		MinuteCounter minuteCDec = new MinuteCounter(Direction.DECREASING);
		
		for(int p = 0; p<65;p++) {
			minuteCDec.count();
			System.out.println(minuteCDec.getCount());
		}
		
//		assertEquals(54,minuteCDec.getCount());

		
	}

}
