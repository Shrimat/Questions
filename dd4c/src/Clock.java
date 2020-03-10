public class Clock {
  protected int secondsSinceMidnight;
  protected boolean twentyFourHour;

  public Clock(int secondsSinceMidnight, boolean twentyFourHour) {
    this.secondsSinceMidnight = secondsSinceMidnight;
    this.twentyFourHour = twentyFourHour;
  }

  public void tick() {
    secondsSinceMidnight++;
  }

  @Override
  public String toString() {
    if (twentyFourHour) {
      return "Clock shows: "
          + (secondsSinceMidnight / 3600 % 24 < 10
              ? "0" + secondsSinceMidnight / 3600 % 24
              : secondsSinceMidnight / 3600 % 24)
          + ":"
          + (secondsSinceMidnight / 60 % 60 < 10
              ? "0" + secondsSinceMidnight / 60 % 60
              : secondsSinceMidnight / 60 % 60)
          + ":"
          + (secondsSinceMidnight % 60 < 10
              ? "0" + secondsSinceMidnight % 60
              : secondsSinceMidnight % 60);
    } else {
      return "Clock shows: " + secondsSinceMidnight + " seconds since midnight.";
    }
  }
}
