package STEP5_FOR;

public class A1_For_Basic_Calculator_Faktoriyel
{
    public static void main(String[]args){

        int toplam=0, count=0;

        for (;count<=3;count++){
            toplam+=count;
        }
        System.out.println("toplam="+toplam);

        int faktoriyel=1, count2;

        for (count2=1;count2<=5;count2++){
            faktoriyel*=count2;
        }
        System.out.println("5 FAKTORIYEL="+faktoriyel);






    }
}
