
package STEP5_FOR;
import java.util.Scanner;
public class A4_For_Ucgen {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.println("sayiyi giriniz");
        sayi=input.nextInt();

        for (int i=1;i<=sayi;i++){


            for (int k=1; k<=sayi-i;k++){

                System.out.print(" ");
            }
            for (int a=0; a<2*i-1;a++){//EGER *2 ISE PRAMIT YAPAR!!!!!!!!!!!!!
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=sayi-1;i>0;i--){
            for (int k=0; k<sayi-i;k++){
                System.out.print(" ");
            }
            for (int a=0;a<2*i-1;a++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
