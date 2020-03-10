public class AlarmClockDemo {
  public static void main(String[] args) throws InterruptedException {
    Clock clock = new AlarmClock(86390, 86398, true);
    while (true) {
      Thread.sleep(1000);
      System.out.println(clock);
      clock.tick();
    }
  }
}
