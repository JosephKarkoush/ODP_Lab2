package alarm;

import time.TimeType;

public class Alarm implements AlarmType
  {
  private boolean active;
  private TimeType time;
  
  public Alarm(TimeType time)
    {
    this.time = time;
    active = true;
    }
  
  @Override
  public void setActive(boolean active)
    {
    //...
    }

  @Override
  public boolean isActive()
    {
    //...
    }

  @Override
  public TimeType getTime()
    {
    //...
    }

  @Override
  public void doAlarm()
    {
    if(active)
      //.... skriv ut notis om att alarm är triggat 
    }
  
  public String toString()
    {
    //... delegera till times toString()-metod
    }
  }
