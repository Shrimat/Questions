public class ClockDemo {
  public static void main(String[] args) throws InterruptedException {
    Clock clock1 = new Clock(86392, false);
    Clock clock2 = new Clock(0, true);

    try {
      while (true) {
        Thread.sleep(1000);
        clock1.tick();
        System.out.print(clock1);
        System.out.print("  ");
        clock2.tick();
        System.out.println(clock2);
      }
    } catch (Exception e) {
      throw new InterruptedException("Time out!");
    }


  }
}
