public class Palindrome {
    public static void main(String[] args) {
        for (int i=1; i <= 2000; i++) {
            int cubed = (int) Math.pow(i, 3);
            String strVersion = String.valueOf(cubed);
            int n = strVersion.length();
            boolean flag = true;
            if (n % 2 == 0) {
                for (int j = 0; j < n/2; j++) {
                    if (strVersion.charAt(j) != strVersion.charAt(n-j-1)){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i + " cubed is " + cubed);
                }
            } else {
                for (int j = 0; j < (n-1)/2; j++) {
                    if (strVersion.charAt(j) != strVersion.charAt(n-j-1)){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i + " cubed is " + cubed);
                }

            }
        }
    }
}
