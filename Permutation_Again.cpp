#include<iostream>
using namespace std;
int main(){
    
    int t = 0,i = 0;
    
    cin>>t;
    
    long n = 0;
    
    for(i = 0; i < t; i++){
        
        cin>>n;
        
        if(n == 1)
            cout<<"1"<<"\n";
            
        else{
            
            long ans = (n * n) / 2;
            
            cout<<(ans - 1)<<"\n";
            
        }
    }
    return 0;
}
