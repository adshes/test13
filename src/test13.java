import java.util.Scanner;
public class test13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку1: ");
        String ct = in.nextLine();

        System.out.print("Введите строку2: ");
        String ct1 = in.nextLine();

        if (ct.length() > ct1.length())
            System.out.println(ct);
        else if (ct.length() < ct1.length())
            System.out.println(ct1);
        else
            System.out.println("Строки равны");


    }
}