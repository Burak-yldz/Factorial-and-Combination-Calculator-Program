import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        /*--------------factoral calculator-----------------------
        int k;
        int total = 1;

        Scanner input= new Scanner(System.in);

        System.out.print("Please enter a factorial number  : ");
        k = input.nextInt();


        for ( int i=1; i <= k; i++ ) {
            total = total * i ;
        }
        System.out.println(k + ".factorial = " + total);

        */


        /*-----------combination calculator formula = C(n,r) = n! / (r! * (n-r)!) --------------- */

        int n,r,nR,totaln = 1,totalr = 1,totalNr = 1;

        Scanner input= new Scanner(System.in);

        System.out.print("Please enter n eleman number  : ");
        n = input.nextInt();

        System.out.print("Please enter r eleman number number  : ");
        r = input.nextInt();

        nR = n-r;

        for (int i=1 ; i<=n ; i++){
            totaln = totaln * i ;
        }

        for (int i=1 ; i<=r ; i++){
            totalr = totalr * i ;
        }

        for (int i=1 ; i<=nR ; i++) {
            totalNr = i * totalNr;
        }
        System.out.println("Combination formula result = " + totaln / (totalr*totalNr));
    }
}
