public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "mom";

        System.out.println(checkPal(str, 0, str.length()-1));
    }

    public static boolean checkPal(String str,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }

        if(str.charAt(start)!=str.charAt(end))
        {
            return false;
        }

        return checkPal(str, start+1, end-1);
    }
 

}
