package counter;

import counter.CircularCounter.Direction;

public class SecondCounter extends SettableCounter {
	public SecondCounter() {
		this(Direction.INCREASING, null); // vad anropas här?
	}

	public SecondCounter(CounterType next) {
		this(Direction.INCREASING, next); // vad anropas här?
	}

	public SecondCounter(Direction direction) {
		this(direction, null); // vad anropas här?
	}

	public SecondCounter(Direction direction, CounterType next) {
		super(60, direction, next); // vad anropas här?
	}
}
