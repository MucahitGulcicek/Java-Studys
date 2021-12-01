import java.util.Scanner;

public class ThirdProgram
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz :");
        int a = scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        int b = scan.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        
    }
}
