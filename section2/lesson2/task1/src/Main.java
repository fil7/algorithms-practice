import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(calculateF(n));
  }

  public static long calculateF(int n) {
    long[] f = new long[n + 1];
    f[0] = 0;
    f[1] = 1;
    for(int i = 2; i <= n; i++) {
      f[i] = f[i - 1] + f[i - 2];
    }
    return f[n];
  }
}