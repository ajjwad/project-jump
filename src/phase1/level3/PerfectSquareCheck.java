package phase1.level3;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        int num=253;
        boolean perfectSquare=false;
        for(int i=1;i*i<=num;i++){
            if(i*i==num){
                perfectSquare=true;
                break;
            }
        }
        if (perfectSquare) {
            System.out.println(num + " is a perfect square");
        } else {
            System.out.println(num + " is not a perfect square");
        }
    }
}
