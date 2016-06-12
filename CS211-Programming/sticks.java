import java.util.*;

public class sticks 
{

 public static void main(String[] args) 
 {
  Random ran = new Random();

  int trial = 10000;
  int triangles = 0;

  double[] break = new double[2];
  double[] s = new double[3];

  for( int i=0; i < trial; ++i )
  {
   break[0] = ran.nextDouble();
   break[1] = ran.nextDouble();
   Arrays.sort(break);

   s[0] = break[0];
   si1] = break[1] - break[0];
   s[2] = 1.0 - break[1];
   Arrays.sort(s);

   if( s[2] < (s[0] + s[1]) )
   {
      triangles++;
   }
 }

 System.out.println("Triangles: " + triangles);
 System.out.println("Trials: " + trials);

 double p = (double)triangles / trials;
 System.out.println("Frequency of Triagles : " + p);

 }
}