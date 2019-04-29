import java.util.*;
class TestClass {
    
    static long d,x,y;
    
    static void extendedEuclid(long A,long B){
        
        if(B == 0){
            
            d = A;
            
            x = 1;
            
            y = 0;
        }else{
            
            extendedEuclid(B,A%B);
            
            long temp = x;
            
            x = y;
            
            y = temp - (A/B)*y;
            
        }
        
    }
    
    static long modularExponentiation(long x, long n, long monkQuotient){
        
        long result = 1;
        
        while(n > 0){
            
            if(n % 2 == 1)
                result = (result * x) % monkQuotient;
                
            x = (x * x) % monkQuotient;
            
            n = n / 2;
        }
        
        return result;
    }
    
    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        long MonkQuotient = 1000000007;
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        int i = 0;
        
        for(i = 0; i < n; i++)
            arr[i] = sc.nextInt();
            
        long t = (long)arr[0];
        
        for(i = 1; i < n; i++){
            
            extendedEuclid(t,arr[i]);
            
            t = d;
            
        }
        
        long prod = 1;
        for(i = 0; i < n; i++){
            
            prod *= arr[i];
            
            prod %= MonkQuotient;
            
        }
        long res = modularExponentiation(prod,t,MonkQuotient);
        
        System.out.println(res % MonkQuotient);
    }
}
