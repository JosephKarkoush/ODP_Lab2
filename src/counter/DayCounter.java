package counter;

import counter.CircularCounter.Direction;

public class DayCounter extends SettableCounter {
	public DayCounter() {
		this(Direction.INCREASING, null); // vad anropas här?
	}

	public DayCounter(CounterType next) {
		this(Direction.INCREASING, next); // vad anropas här?
	}

	public DayCounter(Direction direction) {
		this(direction, null); // vad anropas här?
	}

	public DayCounter(Direction direction, CounterType next) {
		super(7, direction, next); // vad anropas här?//

	}

}
