#include <bits/stdc++.h>
#include <iostream>
using namespace std;
 
int main(){
    int n1,n2;
    cin>>n1>>n2;
    int count = 0;
    int i;
    for(i=n1;i<=n2;i++){
        int n = i;
        int a = 2;
        int temp = 0;
        while(a<=(n/2)){
            if((n%a)==0){
                temp++;
                break;
            }
            a++;
        }
        if(temp==0 && i!= 1){
        count++;     
        }
    }
    cout<<+count;
    return 0;
}

 
   