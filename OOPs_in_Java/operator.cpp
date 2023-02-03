#include<iostream>
using namespace std;
int main(){
    int a,b,choice;
    cout<<"Enter two numbers";
    cin>>a>>b;
    cout<<"Enter the choice 1 for addition 2 for substraction 3 for multiply";
    cin>>choice;
    switch(choice){
        case 1:
        cout<<a+b;
        break;
        case 2:
        cout<<a-b;
        break;
        case 3:
        cout<<a*b;
        break;
        default:
        cout<<"sahi operator lgga oyee";

    }

}