import java.util.*;
public class HuffmanEncode
{
	public static void main (String args[])
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a string : ");
			String s1 = scan.nextLine();
			int arr[] = new int [256];
			int max = 0;
			int key = 0;
			int oldkey = 0;

			for(int i = 0; i<s1.length(); i++)
				{
					int temp = s1.charAt(i); //searching through the string inputted to find the occuring characters
					arr[temp]++;
			    }
			    for(int y = 0; y< s1.length() ;y++) //the maximum amount of letter that could be printed is the length of the string
			    {                                     // ie the string enter could have all different characters
			    max = 0; //reseting the max
			    for(int x =0; x<arr.length; x++)
			    	{
			    		if(arr[x]>max) //find the letter that occurs most in the array
			    		{
			    			key = x;
			    			max = arr[x];
			    		}
			    	}
			    	if(arr[oldkey] != arr[key]) //To stop the program from printing out the last letter multiple times
			    	{
			    		oldkey = arr[key]; //storing the key
			    		arr[key] = 0; // deleting the last most occuring letter from the array
			    		System.out.print((char)key);// casting the ASCII key as a char
			    	}
			    }
		}
}
