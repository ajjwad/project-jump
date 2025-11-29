package phase2.level2;

public class CountDigits {
    public static void main(String[] args) {
        int originalNum=2342,count=0;
        int num=originalNum;
        while (num>0){
            num/=10;
            ++count;
        }
        System.out.println("There are "+count+" digits in "+originalNum);
    }
}
