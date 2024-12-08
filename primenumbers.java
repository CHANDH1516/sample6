public class primenumbers {
    public static void main(String[] args) {
        int i, num, count;

        
        System.out.println("Prime number from 1 to 100 are:");

        for (i = 1; i <= 100; i++) {
            count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
