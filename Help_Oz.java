import java.util.*;
 
class TestClass {
    static long arr[];
    
    static boolean check(long m){
        
        long n = arr[0]%m;
        
        for(int i = 1; i < arr.length; i++){
            
            if(arr[i] % m != n)
                return false;
    
        }
        return true;
        
    }
    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        
        arr = new long[M];
        
        for(int i = 0; i < M; i++)
            arr[i] = sc.nextLong();
            
        Arrays.sort(arr);
        
        Vector v = new Vector();
        
        long p = Math.abs(arr[0] - arr[1]);
        
        for(int d = 1; d*d <= p; d++){
            
            if(p % d == 0){
                
                long m1 = d;
                
                long m2 = p/d;
                
                if(m1 != 1 && check(m1))
                    v.add(m1);
                    
                if(m2 != m1 && check(m2))
                    v.add(m2);
                
            }
        
        }
        Collections.sort(v);
        
        Enumeration en = v.elements();
        
        while(en.hasMoreElements()){
            
            System.out.print(en.nextElement()+" ");
            
        }
    }
}
