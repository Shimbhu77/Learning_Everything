public class ReverseString {
    
    public static void main(String[] args) {
        String str = "payal";
        char[] chars = str.toCharArray();
        System.out.println(new String(chars));
        reverse(chars, 0, chars.length-1);
        System.out.println(new String(chars));
    }


    public static void reverse(char[] chars,int start,int end)
    {
        if(start>=end)
        {
            return;
        }

        char ch = chars[start];
        chars[start] = chars[end];
        chars[end] = ch;

        reverse(chars, start+1, end-1);

    }
}
