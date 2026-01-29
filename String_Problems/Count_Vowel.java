// I/P= "Hello"
// O/P= 2  

public class Count_Vowel {
    static void  count_vowel(String s)
    {
        StringBuilder sb= new StringBuilder();
        int count=0;
        for(int i=0; i<s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        String s= "Hello";
count_vowel(s);
    }
}
