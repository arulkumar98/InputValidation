import java.util.Arrays;

public class Main {
    //{{} , {(abc)(jn)}
    public static void main(String[] args) {
        String patternOne = "{{}";
        String patternTwo = "{(abc)(jn)";
        Main main = new Main();
        main.splitString(patternTwo);
   

    }

    public void splitString(String str) {
        StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
            else if (Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
        System.out.println(special.length());
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                if (i == special.length()) {
                    System.out.println("it's valid");
                }
            }
        }
    }
}




