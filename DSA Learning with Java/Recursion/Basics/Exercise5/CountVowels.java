public class CountVowels {
    public static void main(String[] args) {
        String str = "shimbhu";

        System.out.println(countVowels(str, str.length()-1));
    }

    public static int countVowels(String str,int index)
    {
        if(index == -1)
        {
            return 0;
        }
         
        if(str.charAt(index)=='a'||str.charAt(index)=='e'||str.charAt(index)=='i'||str.charAt(index)=='o'||str.charAt(index)=='u')
        {
            return 1+countVowels(str, index-1);
        }
        else
        {
            return countVowels(str, index-1);
        }
    }
}
