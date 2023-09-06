package counter;

public class MinuteCounter extends CircularCounter {
	public MinuteCounter() {
		this(Direction.INCREASING, null); // vad anropas här?
	}

	public MinuteCounter(CounterType next) {
		this(Direction.INCREASING, next); // vad anropas här?
	}

	public MinuteCounter(Direction direction) {
		this(direction, null); // vad anropas här?
	}

	public MinuteCounter(Direction direction, CounterType next) {
		super(60, direction, next); // vad anropas här?////
	}
}
