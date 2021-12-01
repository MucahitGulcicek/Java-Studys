import java.util.Scanner;

public class FourthProgram
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Adınız :");
        String yazi = scan.nextLine();

        System.out.println("Merhaba"+" "+yazi+" "+"Nasılsın ?");

        System.out.print("Yaşınız :\n");

        int yas = scan.nextInt();

        int dogumTarihi = 2021 - yas;
        System.out.print("Ooo"+" "+dogumTarihi+" "+"yılında doğmuşsunuz...");
    }
}
