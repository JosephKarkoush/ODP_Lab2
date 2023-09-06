package counter;

public class HourCounter extends SettableCounter {

	public HourCounter() {
		this(Direction.INCREASING, null); // vad anropas här?
	}

	public HourCounter(CounterType next) {
		this(Direction.INCREASING, next); // vad anropas här?
	}

	public HourCounter(Direction direction) {
		this(direction, null); // vad anropas här?
	}

	public HourCounter(Direction direction, CounterType next) {
		super(24, direction, next); // vad anropas här?//

	}
}
