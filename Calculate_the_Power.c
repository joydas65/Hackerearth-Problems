#include<stdio.h>
 
long long int modularExponentiation(long long int x,long long int n,long long int mod){
    
    long long int result = 1;
    
    while(n > 0){
        
        if(n % 2 == 1)
            result = (result * x) % mod;
        
        x = (x * x) % mod;
        
        n /= 2;
    }
    return result;
}
 
int main(){
    
    long long int A = 0,B = 0,mod = 1000000007;
    
    scanf("%lld %lld",&A,&B);
    
    printf("%lld",modularExponentiation(A,B,mod));
    
    return 0;
}
