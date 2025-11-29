package phase1.level4;

public class CharCheck {
    public static void main(String[] args) {
        char ch='d';
        if (Character.isLetter(ch))
            System.out.println(ch + " is a Letter");
        else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit");
        }else
            System.out.println("Neither a digit or letter");
    }
}
