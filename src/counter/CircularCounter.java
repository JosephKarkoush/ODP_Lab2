package counter;

public abstract class CircularCounter implements CounterType {

	public enum Direction {
		INCREASING, DECREASING
	};

	private int currentCount;
	private boolean isPaused;
	private final int MAX_NR_OF_COUNTS;
	private Direction direction;
	private CounterType nextCounter;

	public CircularCounter(int maxNrOfCounts, Direction direction, CounterType nextCounter) {
		this.direction = direction;
		this.nextCounter = nextCounter;
		// Fixa ej rimliga inputvärden
		if (maxNrOfCounts < 2)
			this.MAX_NR_OF_COUNTS = 0;
		else
			this.MAX_NR_OF_COUNTS = maxNrOfCounts;
		// Om det är en nedåträknare, börja räkna från högsta värde istället
		// för från noll
		if (this.direction == Direction.DECREASING && this.MAX_NR_OF_COUNTS > 0)
			currentCount = MAX_NR_OF_COUNTS - 1;
	}
	
	public void setCurrentCount(int newCurrentCount) {
		currentCount = newCurrentCount;
	}
	
	@Override
	public int getCount() {
		return currentCount;
	}

	// Starta om räknare från början
	@Override
	public void reset() {
		currentCount = 0;
	}

	@Override
	public void pause() {
		isPaused = true;
	}

	@Override
	public void resume() {
		isPaused = false;
	}

	@Override
	public void count() {
		if (!isPaused && this.MAX_NR_OF_COUNTS > 0) {
			if (direction == Direction.INCREASING) {
				currentCount++;
				if (currentCount >= MAX_NR_OF_COUNTS) {
					if (nextCounter != null) {
						nextCounter.count();
					}
					reset();
				}
			} else if (direction == Direction.DECREASING) {
				if (currentCount > 0) {
					currentCount--;
					if (currentCount <= 0) {
						if (nextCounter != null) {
							nextCounter.count();
						}
						reset();
					}
				} else {
					currentCount = MAX_NR_OF_COUNTS - 1;

				}
			}
		}
	}

	@Override
	public String toString() {
		return Integer.toString(currentCount);
	}

}
