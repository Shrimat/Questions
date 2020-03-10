public class AlarmClock extends Clock {
  protected boolean sounding;
  protected int alarmTime;

  public AlarmClock(int secondsSinceMidnight, int alarmTime, boolean twentyFourHour){
    super(secondsSinceMidnight, twentyFourHour);
    this.alarmTime = alarmTime;
    sounding = false;
  }

  @Override
  public void tick() {
    super.tick();
    if (alarmTime == secondsSinceMidnight) {
      sounding = true;
    } else if (alarmTime < secondsSinceMidnight-59) {
      sounding = false;
    }
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
