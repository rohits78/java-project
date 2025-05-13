import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPallindrome(123));
    }
    public static int rev(int n){
        int rev = 0;
        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        return rev;
    }
    public static boolean isPallindrome(int n){
        if (n == rev(n)) {
            return true;
        }
        return false;
    }
}

