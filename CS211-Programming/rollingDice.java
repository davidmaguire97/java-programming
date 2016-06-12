import java.util.*;
public class lab9
{


  public static void main (String args[])
  {
    int t = 10000000;
    boolean sneeze = false;
    boolean snap = false;
    int rolledSix = 0;
    boolean rolled = false;
    int tempcount = 0;
    int temp = 0;
    int total = 0;
    int count = 0;


    for(int i=0; i<t; i++)
    {
        int roll = (int)(1+ 6*Math.random());
        tempcount++;


        if(roll == 6)
        {

          temp = tempcount;
          tempcount = 0;
          rolled = true;

        }

        if(rolled)
        {
        	int snz = (int)(1+1000*Math.random());

            if(snz == 100)
            {
               sneeze = true;
            }


            int snp = (int)(1+1000*Math.random());

            if(snp == 100)
            {
             snap = true;
            }


            if(snap == true && sneeze == true)
            {
               count = temp;

            }
            count = temp;
        }

        total += count;


     }
     //Add six as it takes on average 6 throws regardless of snapchats or sneezing
     total = total/t;
     System.out.println(total);


}
}