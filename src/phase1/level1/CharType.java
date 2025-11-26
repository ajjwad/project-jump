package phase1.level1;

public class CharType {
    public static void main(String[] args) {
        char ch='F';
        if(ch>='A' && ch<='Z')
            System.out.println("Uppercase");
        else if (ch>='a' && ch<='z')
            System.out.println("Lowercase");
        else if (ch>='0' && ch<='9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}
