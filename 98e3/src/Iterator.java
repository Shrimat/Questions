public class Iterator {
    public static void main(String[] args){
        int starter = Integer.parseInt(args[0]);

        System.out.print(starter + " ");
        while (starter != 1) {
            starter = next(starter);
            System.out.print(starter + " ");
        }


    }

    private static int next(int x) { // What does static do here?
        if (x % 2 == 0) {
            return x/2;
        } else {
            return 3*x + 1;
        }
    }
}
