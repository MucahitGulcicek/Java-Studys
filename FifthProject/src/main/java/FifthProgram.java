import java.util.Scanner;

public class FifthProgram
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int sonuc = topla(3,4);
        sonuc = sonuc * 2;

        System.out.println("Çarpım :"+sonuc);

    }
    public static void seslen()
    {
        System.out.println("Hey");
        System.out.println("Nasılsın ?");

        int a = 4;
        a = 3 * a;
        System.out.println("A:"+a);

    }
    private static int topla(int a,int b)
    {
        int c = a+b;

        return c;
    }
}
