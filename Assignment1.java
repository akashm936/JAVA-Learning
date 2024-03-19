// 1 
// 3 2
// 6 5 4
// 10 9 8 7 
// 15 14 13 12 11

class Assignment1 {
    public static void main(String[] args) {
        int n = 5; 

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
