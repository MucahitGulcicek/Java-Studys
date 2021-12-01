import java.util.Scanner;

public class SecondProgram
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = 10;
        int b = 5;


        boolean calisir = true;


        System.out.print("Seçeneği giriniz :");
        int secenek = scan.nextInt();

        if(secenek == 0 && calisir)
        {
            System.out.println("A + B ="+ (a+b));
        }
        if (secenek == 1 && calisir)
        {
            System.out.println("A - B ="+ (a-b));
        }
        if (secenek == 2 && calisir) {
            System.out.println("A * B =" + (a * b));
        }
        System.out.println("Program sonu!");
    }
}
