import java.util.*;

public class Scrabble {

    public static void main(String args[]) {

        FileIO reader = new FileIO();
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String[] inputs = reader.load(X: /CS211/dictionary.txt);

        for (int y = 0; y < inputs.length; y++) 
        {
            for (int x = 0; x < word.length(); x++) 
            {
                int len = 0;
                int check = 0;

                while (len < inputs[y].length())

                {
                    if (word.charAt(x).comparesTo(inputs[y].charAt(len)) == 0) 
                    {

                        check++;
                    }
                  
                    len++;

                }


                if (check == inputs[y].length()) 
                {

                    System.out.println(inputs[y]);
                }

            }
        }
    }
}