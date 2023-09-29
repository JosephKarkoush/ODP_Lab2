package alarm;



import time.TimeType;

public class Alarm implements AlarmType  {
	private boolean active;
	private TimeType time;

	public Alarm(TimeType time) {
		this.time = time;
		active = true;
	}

	@Override
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public boolean isActive() {
		return this.active;
	}

	@Override
	public TimeType getTime() {
		return time;
	}

	@Override
	public void doAlarm() {
		if (active) {
			System.out.println("Ring Ring Ring");
		} // .... skriv ut notis om att alarm är triggat
	}

	public String toString() {
		// ... delegera till times toString()-metod
		return time.toString();
	}
}
