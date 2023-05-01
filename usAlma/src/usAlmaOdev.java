import java.util.Scanner;

public class usAlmaOdev {
    public static void main(String[] args) {


        int n, r, total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("üssü alınacak sayıyı giriniz:");
        n = input.nextInt();
        System.out.print("üs olacak sayı :");
        r = input.nextInt();


        for(int i = 1; i <= r; i++) {
            total *= n;

        }
        System.out.print("sonuç : " + total);
    }

}
