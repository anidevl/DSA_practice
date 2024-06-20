public class HollowButterflyPattern {

    public static void main(String[] args) {
        int n = 10; // size of the butterfly

        // upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // spaces between wings
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // spaces between wings
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
