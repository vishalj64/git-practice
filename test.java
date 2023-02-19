
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

class Reversal {
    public static void main(String[] args) {
        String  inputString = "xyxyabcdefffxyze";
        
        char[] inputCharArray = inputString.toCharArray();
        for(int i = inputCharArray.length - 1; i >=0; i-- ) {
            output += inputCharArray[i];
        }
        System.out.println(output);
    }
}



public class LongestSequence {
    public static void main(String[] args) {
        char[] arr = "xyxyabcdefffxyze".toCharArray();
        String longestSeq = "";
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                longestSeq += arr[i];
            } else if ((int)arr[i-1] + 1 == (int)arr[i]) {
                longestSeq += arr[i];
            } else {
                set.add(longestSeq);
                longestSeq = "";
                longestSeq += arr[i];
            }
        }
        String a = Collections.max(set, Comparator.comparing(String::length));
        System.out.println(a);
    }
}