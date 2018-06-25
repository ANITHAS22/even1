import java.util.*;
public class Even
{
    public static void main(String args[])
    {
        Scanner io=new Scanner(System.in);
        int n1=io.nextInt();
         int n2=io.nextInt();
        for(int i=n1+1;i<n2;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
