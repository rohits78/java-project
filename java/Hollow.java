import java.util.*;
public class Hollow{
    public static void main(String[] args) {
//        hollow_rect(20, 20);
        for(int i =1; i<=4; i++){
            for(int j=1; j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    public static void hollow_rect(int totRow, int totCol){
//        for (int i = 1; i <= totRow; i++) {
//            for (int j = 1; j<= totCol; j++){
//                if(i==1 || i==totRow || j==1 || j==totCol){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }

}
