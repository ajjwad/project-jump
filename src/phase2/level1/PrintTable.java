package phase2.level1;

public class PrintTable {
    public static void main(String[] args) {
        int num=81;
        for(int i=1;i<=10;i++) {
            int ans = num * i;
            System.out.println(num+"*"+i+"="+ans);
        }
    }
}
