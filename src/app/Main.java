package app;

public class Main {
        public static void main(String[] args) {
            int totalSum = 0;

            for (int i = 1; i <= 6; i++) {
                totalSum += i;
                System.out.println(i + ") Num is " + i + ", sum is " + totalSum);
            }
            System.out.println("------------------------");
            System.out.println("Sum of numbers is " + totalSum);
        }
    }