import java.util.Scanner;
class main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float p,t,r;
p=sc.nextFloat();
t=sc.nextFloat();
r=sc.nextFloat();
float si=(p*t*r)/100;
System.out.printf("%.2f",si);
}
}