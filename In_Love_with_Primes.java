import java.util.*;
class TestClass {
    public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int i,j;
        
        boolean arr[] = new boolean[100000];
        
        Arrays.fill(arr,true);
        
        i = 2;
        
        while(i*i <= 100000){
            
            if(arr[i]){
                
                
                for(j = i*i; j < 100000; j += i){
                    
                    arr[j] = false;
                    
                }
                
            }
            i += 1;
            
        }
        
        
        int tc = sc.nextInt();
        
        for(i = 1; i <= tc; i++){
            
            int n = sc.nextInt();
            
            int flag = 0;
            
            for(j = 2; j <= n/2; j++){
                
                if(arr[j] && arr[n-j]){
                    
                    flag = 1;
                    
                    break;
                    
                }
            }
            if(flag == 1)
            System.out.println("Deepa");
            else
            System.out.println("Arjit");
        }
    }
}
