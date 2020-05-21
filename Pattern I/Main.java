#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  n--;
   for(int i=0;i<4;i++){
     for(int j=0;j<=i;j++)
       cout<<i+1+n;
        cout<<endl;
   }
    for(int i=0;i<4;i++){
     for(int j=0;j<4-i;j++)
       cout<<4-i+n;
      cout<<endl;}
     
   
  return 0;
}