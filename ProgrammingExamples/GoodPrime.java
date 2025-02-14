import java.util.Scanner;

class GoodPrime 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Start For Range: ");
        int start = sc.nextInt();
        System.out.print("Enter The End For Range: ");
        int end = sc.nextInt();
        sc.close(); 

        for (int i = start; i <= end; i++) {
            if (i < 2) continue; 
            boolean isPrime = true;

            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (i > 9) { 
                    int num = i;
                    boolean gprime = true;

                    while (num > 0) {
                        int rem = num % 10; 
                        if (rem!=2&&rem !=3&&rem!=5&&rem!=7) { 
                            gprime = false;
                            break;
                        }
                        num /= 10; 
                    }

                    if (gprime) {
                        System.out.println(i + " ");
                    }
                } else {
                    System.out.println(i); 
                }
            }
        }
    }
}