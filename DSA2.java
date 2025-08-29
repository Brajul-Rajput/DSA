// X10  ----> Xn    Decimal to convert Anybase
import java.util.Scanner;
public class DSA2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
int pow=0;
while(num>0){
    int rem=num%10;
    sum=rem+sum*(int)Math.pow(10,pow);
    pow++;
    num=num/10;
}
System.out.println(sum);
        sc.close();
    }
}
