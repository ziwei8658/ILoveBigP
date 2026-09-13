package ILoveBigP;
public class Messages {
    int amount;
    String sign;

    public Messages(int amount, String sign)
    {
        this.amount = amount;
        this.sign = sign;
    }

    public void printMessage()
    {
        for(int i=0;i<amount;i++)
        {
            System.out.print(sign);
        }
    }
}
