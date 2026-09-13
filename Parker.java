package ILoveBigP;
import java.util.Scanner;
import static java.lang.System.out;

public class Parker {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        out.println("What's ya number? gimme integer");

        int myNum = sc.nextInt();
        int value = myNum;
        for(int i=0; i<50; i++)
        {
            myNum+=value;
        }

        myNum*=value;
        out.println(myNum);
        sc.close();
    }


}
