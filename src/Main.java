import java.util.Scanner;

public class Main {
    // Check if creating another subscription is less than continuing the previous subscription.
    // Then calculate the total cost by adding the individual costs.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextInt();
        long[] days = new long[N];
        for (int i = 0; i < N; i++) {
            days[i] = Long.parseLong(sc.next());
        }

        long cost = 0;
        for (int i = 0; i < N; i++) {
            if (i < 1) {
                cost += 1 + K;
            } else {
                long length = days[i] - days[i-1];
                if (length > K) {
                    cost += 1 + K;
                } else {
                    cost += length;
                }
            }
        }
        System.out.println(cost);
    }
}