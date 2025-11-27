package phase1.level2;

public class AlphabetCheck {
    public static void main(String[] args) {
        char ch='m';
        if(ch>='a' && ch<='m'){
            System.out.println("The character lies between a and m");
        } else if (ch>='n' && ch<='z') {
            System.out.println("The character lies between n and z");
        } else
            System.out.println("Not a alphabet");
    }
}
