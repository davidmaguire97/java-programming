import java.util.*;
public class CrackCipher
{
   public static void main(String [] args){
       Scanner sc=new Scanner(System.in);

       //finding x

       long p=24852977;
       long g=2744;
       long gxmodp=8414508;
       long x=0;
       long stage1=0;
       boolean found=false;
       while(found==false){
       x++;
       stage1=modPow(g,x,p);
       if(stage1==gxmodp){
           found=true;
        }
    }
    System.out.println("Private Key: "+x);

     //finding y

    long stage2=0;
    long c1=15268076;
    long c2=743675;
    long y=0;
    found=false;

    while(found==false){
        y++;
        stage2=modPow(g,y,p);
        if(stage2==c1){
            found=true;
        }
    }

    //finding m

    long stage3=modPow(c1,p-1-x,p);
    long stage4=c2%p;
    long stage5=stage3*stage4;
    long answer=stage5%p;
    System.out.println("Message: "+answer);

    }
    public static long modPow(long number, long power, long modulus){
           
            if(power==0)
            return 1;
            else if (power%2==0) {
            long halfpower=modPow(number, power/2, modulus);
            return modMult(halfpower,halfpower,modulus);
            }else{
            long halfpower=modPow(number, power/2,
            modulus);
            long firstbit = modMult(halfpower,halfpower,modulus);
            return modMult(firstbit,number,modulus);
          }
     }
     public static long modMult(long first, long second, long modulus){
        
        if(second==0)
        return 0;
        else if (second%2==0) {
        long half=modMult(first, second/2, modulus);
        return (half+half)%modulus;
        }else{
        long half=modMult(first, second/2, modulus);
        return (half+half+first)%modulus;
        }
    }
}