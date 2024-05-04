import java.util.ArrayList;
import java.util.List;

public class PrintBinaryNumber {
    public static void main(String[] args) {
        
         int count1 =0;
         int count0 =0;
         int n = 3;
    
         ArrayList<String> ans = new ArrayList<>();
         generateBinaryString(n,count1,count0,ans,new StringBuilder());

        for(String st : ans)
        {
            System.out.println(st);
        }

    }

    public static void generateBinaryString(int n,int count1,int count0,List<String> ans,StringBuilder sb)
    {
        if(count0 > count1)
        {
            return;
        }

        if(sb.length() == n && count1 >= count0)
        {
            ans.add(sb.toString());
            return;
        }

        sb.append(1);
        generateBinaryString(n, count1+1, count0, ans, sb);
        sb.deleteCharAt(sb.length()-1);

        sb.append(0);
        generateBinaryString(n, count1, count0+1, ans, sb);
        sb.deleteCharAt(sb.length()-1);

    }
}
