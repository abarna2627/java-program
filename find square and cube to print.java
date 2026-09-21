import java.util.Scanner;
public class Hello
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int sq = n*n;
        int cube = n*n*n;
        System.out.print(sq+"\n"+cube);
    }
}
        
