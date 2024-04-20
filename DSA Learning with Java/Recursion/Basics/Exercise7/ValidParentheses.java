import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    

    public static void main(String[] args) {
        int n = 3;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        genParen(n, 0, 0, list, sb);
        System.out.println(list);
    }

    public static void genParen(int n,int left ,int right,List<String> list,StringBuilder sb)
    {

        if(left == n && right == n)
        {
            System.out.println(sb.toString());
            list.add(sb.toString());
            return;
        }

        if(left < n)
        {
            sb.append("(");
            genParen(n, left+1, right, list, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(right < left)
        {
            sb.append(")");
            genParen(n, left, right+1, list, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
