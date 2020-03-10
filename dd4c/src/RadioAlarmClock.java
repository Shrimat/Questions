public class RadioAlarmClock extends AlarmClock {
  private RadioStation radioStation;

  public RadioAlarmClock(int secondsSinceMidnight, int alarmTime, boolean twentyFourHour, RadioStation radioStation) {
    super(secondsSinceMidnight, alarmTime, twentyFourHour);
    this.radioStation = radioStation;
  }

  @Override
  public void tick() {
    super.tick();
  }

  @Override
  public String toString() {
    if(radioStation.equals(RadioStation.NONE)) {
      return super.toString();
    } else {
      return s
    }
  }
}
