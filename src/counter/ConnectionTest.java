package counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import alarmklocka.CircularCounter.Direction;

class ConnectionTest {

	@Test
	void test() {
		
		HourCounter hourC = new HourCounter(Direction.DECREASING);
		MinuteCounter minCounter = new MinuteCounter(Direction.DECREASING, hourC);
		SecondCounter secondC = new SecondCounter(Direction.DECREASING, minCounter);
		
		for(int i = 0; i < 3700; i++ ) {
			secondC.count();
		
			
		}
		
		String str = hourC.toString() + ":" + minCounter.toString() + ":" + secondC.toString();
		
		 System.out.println("It has passed: " + str);
		 
			assertEquals("22:58:19",str);
			
//------------------------------------------------------------------------------------------			
			HourCounter hourCINC = new HourCounter(Direction.INCREASING);
			MinuteCounter minCounterINC = new MinuteCounter(Direction.INCREASING, hourCINC);
			SecondCounter secondCINC = new SecondCounter(Direction.INCREASING, minCounterINC);
			
			for(int i = 0; i < 3700; i++ ) {
				secondCINC.count();
		
				
			}
			
			String str2 = hourCINC.toString() + ":" + minCounterINC.toString() + ":" + secondCINC.toString();
			
			 System.out.println("It has passed: " + str2);
			 
				assertEquals("1:1:40",str2);

		 
	}
	
	

}
