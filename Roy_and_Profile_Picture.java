import java.util.*;
class TestClass {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        String ans[]=new String[n];
        for(int i=0;i<n;i++)
        {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w==h&&w>=l&&h>=l)
            ans[i]="ACCEPTED";
            else if(w!=h&&w>=l&&h>=l)
            ans[i]="CROP IT";
            else
            ans[i]="UPLOAD ANOTHER";
        }
        for(int i=0;i<n;i++)
        System.out.println(ans[i]);
        
    }
}
