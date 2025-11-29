package phase2.level1;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num=235,product=1;
        while(num>0){
            product*=num%10;
            num/=10;
        }
        System.out.println("Product of the digits is:"+product);
    }
}
