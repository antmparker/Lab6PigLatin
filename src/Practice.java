import java.util.Scanner;

/**
 * Created by anthonymparker on 2/7/17.
 */
public class Practice {
    public static void main(String[] args) {

        //output a count from 1 to 1000
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
        //output a count from 200 to 0 by fours
        for (int e = 200; e >= 0; e -= 4) {
            System.out.println(e);
        }
        //take an int from the user
        //keep prompting them for an int until it's between 1 and 10
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a number: ");
            n = scan.nextInt();

        } while (n < 1 && n > 10);

        System.out.println("Thank you; your number is " + n);

        String sentence = "Hello world";
        //output the contents of sentence until the first space
        //find space
        int firstSpace = sentence.indexOf(' ');
        String firstWord = sentence.substring(0, firstSpace);
        System.out.println(firstWord);
        String w = firstWord("here is a word");
        System.out.println(w);
    }

    public static String firstWord(String sentence) {
        int firstSpace = sentence.indexOf(' ');
        String firstWord = sentence.substring(0, firstSpace);
        return firstWord;



    }
}






