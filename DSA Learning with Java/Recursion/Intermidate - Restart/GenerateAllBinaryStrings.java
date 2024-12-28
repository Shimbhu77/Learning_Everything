import java.util.*;

public class GenerateAllBinaryStrings {

    public static void main(String[] args) {

      List<String> answers = new ArrayList<>();

      int k = 4;
      int n = 0;
      StringBuilder sb = new StringBuilder();
      
      generateAllBinaryStringsWithoutConsecutives1s(k, sb, n, answers);

      System.out.println(answers);

    }

    private static void generateAllBinaryStringsWithoutConsecutives1s(int k, StringBuilder sb, int n, List<String> ans){

        if(n==k)
        {
            ans.add(sb.toString());
            return;
        }

        if(sb.length() > 0 && sb.charAt(sb.length()-1) == '1'){
            sb.append('0');
            generateAllBinaryStringsWithoutConsecutives1s(k, sb, n+1, ans);
            sb.deleteCharAt(sb.length()-1);
        }
        else
        {
            sb.append('0');
            generateAllBinaryStringsWithoutConsecutives1s(k, sb, n+1, ans);
            sb.deleteCharAt(sb.length()-1);

            sb.append('1');
            generateAllBinaryStringsWithoutConsecutives1s(k, sb, n+1, ans);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
     
}