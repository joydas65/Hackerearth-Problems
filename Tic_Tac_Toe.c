#include<stdio.h>
 
long long int modularExponentiation(long long int x, long long int n,long long int M){
    
    long long int result = 1;
    
    while(n > 0){
        
        if(n % 2 == 1)
            result = (result * x) % M;
        
        x = (x * x) % M;
        
        n /= 2;
        
    }
    
    return result;
    
}
 
 
long long int modInverse(long long int A, long long int M){
    
    return modularExponentiation(A,M-2,M);
    
}
 
int main(){
    
    long long int mod = 1000000007;
    
    long long int fourInverse = modInverse(4,mod);
    
    long long int sixInverse = modInverse(6,mod);
    
    long long int t = 0,n = 0,i = 0,temp = 0;
    
    scanf("%lld",&t);
    
    for(i = 0; i < t; i++){
        
        scanf("%lld",&n);
        
        temp = ((n % mod) * ((n - 1) % mod)) % mod;
        
        long long int minx = ((((temp % mod) * ((n - 1) % mod)) % mod) * (fourInverse % mod)) % mod;
        
        printf("%lld ",minx);
        
        temp = ((((temp % mod) * (((2 * n) - 1) % mod)) % mod) * (sixInverse % mod));
        
        printf("%lld\n",temp % mod);
        
    }
    
    return 0;
    
}
