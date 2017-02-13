/**
 * Created by kirthanaaraghuraman on 2/13/17.
 */
public class ReverseStringWithSpaces {

    static String reverseStringWithSpaces(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (i > 0 && s.charAt(i - 1) != ' ') {
                    result.append(temp.reverse().toString());
                    temp.setLength(0);
                }
                result.append(' ');
            } else if (i == s.length() - 1) {
                temp.append(s.charAt(i));
                result.append(temp.reverse().toString());
                temp.setLength(0);
            } else{
                temp.append(s.charAt(i));
            }
        }
        return result.toString();

    }
    public static void main(String args[]) {

        String input = "I love   India, my   country!";
        System.out.println(reverseStringWithSpaces(input));
    }
}
