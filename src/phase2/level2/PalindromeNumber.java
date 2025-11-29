package phase2.level2;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=1246421;
        int originalNum=num;
        int reversedNum=0;
        while(num>0){
            reversedNum=num%10+(reversedNum*10);
            num/=10;
        }
        if(reversedNum==originalNum)
            System.out.println("It is a palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
