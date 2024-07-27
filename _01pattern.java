import java.util.*;

public class _01pattern {

    public static void pyramid() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.print("\n");

        }
    }

    public static void reverse_pyramid() {
        int n = 8;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void half_pyramid() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void inverted_rotated_pyramid() {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void inverted_rorated_half_pyramid() {
        // // Inverted Half Pyramid with Number
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void flyod_tringle() {
        // Floyd' Traingle
        int n = 5;
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println("");
        }
    }

    public static void butter_fly() {
        // Butterfly Pattern
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rohumbus() {
        // Rohumbus

        int n = 10;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        pyramid();
        reverse_pyramid();
        half_pyramid();
        inverted_rotated_pyramid();
        inverted_rorated_half_pyramid();
        flyod_tringle();
        butter_fly();
        rohumbus();
    }
}
