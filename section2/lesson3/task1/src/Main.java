import java.util.Scanner;

/**
 * Euclidean algorithm
 * Алгоритм Евклида для нахождения НОД (наибольший общий делитель)
 * Большее из чисел заменяется на остаток от деления.
 * Каждый шаг уменьшает одно из чисел хотя бы вдвое.
 * Количество шагов: log a + log b ( так как a % b < a/2)
 */

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }


    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}