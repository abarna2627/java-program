import java.util.Scanner;
public class Hello
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int avg = (n1+n2+n3)/3;
        System.out.print(avg);
    }
}
