import java.util.Scanner;

//Solución menos eficiente. O(n*log(n))
public class Solution {

    static boolean isAnagram(String a, String b) {
        Boolean retValue = false;
        if(a != null && a != null) {
            char [] arrayA = a.toLowerCase().toCharArray();
            char [] arrayB = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(arrayA);
            java.util.Arrays.sort(arrayB);
            retValue = java.util.Arrays.equals(arrayA, arrayB);
        }
     return retValue;
        }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
