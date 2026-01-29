I/P=  (())
O/P=  ()  

public class Remove_Outer_Parathesis {
    static void remove_parathesis(String str) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //Because sb se ek ek i have to comapare na bhai
            if (ch == '(') {
                count++;

                if (count > 1) {
                    result.append(ch);
                }
            }

            if (ch == ')') {


                if (count > 1) {

                    result.append(ch);
                }
                count--;
            }

        }
        System.out.println(result);
    }
    public static void main(String[] args)
    {
        String str= "(())";
        remove_parathesis(str);
    }
}

