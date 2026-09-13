package ILoveBigP;
public class Messages {
    int amount;
    char sign;

    public Messages(int amount, char sign)
    {
        this.amount = amount;
        this.sign = sign;
    }

    public void printMessage(int amount, char sign)
    {
        for(int i=0;i<amount;i++)
        {
            System.out.print(sign);
        }
    }
}
