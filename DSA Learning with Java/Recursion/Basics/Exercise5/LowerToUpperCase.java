public class LowerToUpperCase {
    public static void main(String[] args) {
        String str = "shimbhukumawat";
        char[] chars = str.toCharArray();
        System.out.println(new String(chars));
        lowerTOUpper(chars,chars.length-1);
        System.out.println(new String(chars));
        upperToLower(chars,chars.length-1);
        System.out.println(new String(chars));
    }


    public static void lowerTOUpper(char[] chars,int index)
    {
        if(index == -1)
        {
            return;
        }

        chars[index] = (char) ('A'+chars[index]-'a');

        lowerTOUpper(chars, index-1);
    }

    public static void upperToLower(char[] chars,int index)
    {
        if(index == -1)
        {
            return;
        }

        chars[index] = (char) ('a'+chars[index]-'A');

        upperToLower(chars, index-1);
    }
}
