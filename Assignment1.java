public class Assignment1 {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the number of rows in the triangle

        int num = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                int temp = num + i - 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(temp + " ");
                    temp--;
                }
                num += i;
            }
            System.out.println();
        }
    }
}
