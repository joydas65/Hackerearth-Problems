#include<stdio.h>
 
int main(){
    
    long long int t,x,n,i,j;
    
    long long int factorial_array[1000003];
    
    scanf("%lld",&t);
    
    factorial_array[0] = 1;
    factorial_array[1] = 1;
    
    for(i = 2; i < 1000003; i++)
    factorial_array[i] = (i * factorial_array[i-1]) % (1000003);
    
    for(i = 0; i < t; i++){
        
        scanf("%lld %lld",&n,&x);
        
        if(n >= 1000003){
            printf("0");
            printf("\n");
        }
        else{
            //printf("%d\n",((factorial_array[n]%1000003)*(x%1000003))%1000003); 
            //printf("%lld\n",((factorial_array[n]%1000003)*(x%1000003))%1000003);
            printf("%lld\n",(factorial_array[n]*x)%1000003);
        }
    }
    return 0;   
}
