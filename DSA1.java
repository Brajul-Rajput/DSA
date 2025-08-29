// Xn  --->   X10   Anybase convert into Decimal 

import java.util.Scanner;
public class DSA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        System.out.println("enter the base : ");
        int base=sc.nextInt();
        int pow=0;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem*(int)Math.pow(base,pow);
            pow++;
            num=num/10; 
        }
        System.out.println("output is : ");
        System.out.println(sum);
        sc.close();


    }
}
