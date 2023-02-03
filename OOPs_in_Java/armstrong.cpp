#include<iostream>
using namespace std;
int main() {
        int num,result=0;
        cout<<"Enter any number";
        cin>>num;
        while(num!=0){
            int n=num%10;
            int result = result+ n*n*n;
            n=n/10;
        }
        if(result==num)
            cout<<"armstrong number";
        
        else
            cout<<"not armstrong number";
        
        
        
    return 0;
}