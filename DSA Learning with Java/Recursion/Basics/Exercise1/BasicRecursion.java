public class BasicRecursion {
    
    // 30 days left for birthday
    // 29 days left for birthday
    // 28 days left for birthday
    // ...
    // 1 days left for birthday
    // Happy Birhtday Payal

    public static void main(String[] args) {
        int days = 30;
        happyBirthDay(days);

    }

    static void happyBirthDay(int days)
    {
        if(days==0)
        {
            System.out.println("Happy Birthday!!! Payal");
            return;
        }
        // else{
        //     System.out.println(days+" days left for Payal birthday");

        //     happyBirthDay(days-1);
        // }

        System.out.println(days+" days left for Payal birthday");

        happyBirthDay(days-1);
        // return;
    }
}
