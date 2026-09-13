package ILoveBigP;
import static java.lang.System.out;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        out.println("input your desired character!");
        String str = sc.next();
        out.println("input num of rows");
        int rows = sc.nextInt();

        for(int i=1; i<rows+1;i++)
        {
            Messages bigP = new Messages(i,str);
            bigP.printMessage();
        }

    }
}
