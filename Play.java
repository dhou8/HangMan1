
import java.util.*;

public class Play
{
    public static void main(String[] args)
    {
        ArrayList <Word> word = new ArrayList <Word>();
        ArrayList <Character> available = new ArrayList <Character>();
        ArrayList <String> guessed = new ArrayList <String>();
        int wrong=0;
        int MAX=5;
        boolean result=false; 
        int right=0;
        Word a = new Word("david","person");
        Word b = new Word("jayden","person");
        Word c = new Word("michael","person");

        word.add(a);
        word.add(b);
        word.add(c);

        while(word.size()>0)
        {
            int rand = (int)(Math.random()*word.size());
            Word WORD = word.get(rand);
            int numLetters = WORD.getNumLetters()+1;
            String[] wordArr = new String[numLetters];
            for (int i=0;i<numLetters-1;i++)
                guessed.add("_");

            while(wrong<=MAX)
            {
                if(right==numLetters)
                {
                    System.out.println("Nice Bruh");
                }
                for (int i=0;i<numLetters-1;i++)  
                {
                    wordArr[i]= (WORD.getWord()).substring(i,i+1);
                }
                System.out.println("Category: " + WORD.getCategory());
                System.out.println("Guess a letter: ");    
                Scanner scan = new Scanner(System.in);
                String letter = scan.nextLine();
                int j=0;
                while (j<numLetters)
                {
                    if (letter.equals(wordArr[j]))
                    {
                        guessed.set(j,letter);
                    }
                    j++;
                }
                System.out.println(guessed);
                for (int i=0;i<numLetters-1;i++)  
                {
                    if (!guessed.get(i).equals(wordArr[i]))
                    {
                        result=false;
                        right++;
                    }
                        
                }

                if (result==true)
                {
                    System.out.println("Congrats bro");
                }
            }
        }
    }
}