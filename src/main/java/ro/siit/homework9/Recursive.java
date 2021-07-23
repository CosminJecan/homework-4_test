package ro.siit.homework9;

public class Recursive {
    public static int increaseStr(int n) {
        for (int i = 1; i <= n; i++) {
            String up = String.valueOf(i);
            System.out.print(" " + up);
        }
        return n;
    }

    public static int decreaseStr(int n) {
        for (int j = n; j >= 1; j--) {
            String down = String.valueOf(j);
            System.out.print(" " + down);
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 8;

        increaseStr(n);
        System.out.println('\r');
        decreaseStr(n);
    }
}