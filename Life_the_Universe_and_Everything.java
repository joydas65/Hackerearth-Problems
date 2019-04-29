import java.util.*;
class TestClass {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true)
        {
            n = sc.nextInt();
            if(n==42)
            break;
            else
            System.out.println(n);
        }
    }
}
