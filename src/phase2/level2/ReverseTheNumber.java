package phase2.level2;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int num=1246243;
        int originalNum=num;
        int reversedNum=0;
        while(num>0){
            reversedNum=num%10+(reversedNum*10);
            num/=10;
        }
        System.out.println("Reversed number is: "+reversedNum);
    }
}
