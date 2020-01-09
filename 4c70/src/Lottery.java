import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random generator = new Random();
        ArrayList storage = new ArrayList();

        for (int i=0; i < 6; i++) {
            do {
                int x = generator.nextInt(48) + 1;
            } while (storage.contains(x));

            System.out.println("Number " + i + ": " + x);
        }

        System.out.println("Bonus Number: " + (generator.nextInt(48) + 1));
    }

}
