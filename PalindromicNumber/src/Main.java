import java.util.Scanner;

public class Main {
    static boolean ispalindromic(String str){
        int i =0;
        int j = str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a word please : ");
        String word = input1.nextLine();
        System.out.println(ispalindromic(word));

    }
}