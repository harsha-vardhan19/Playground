#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int i=1,p=121;
  do
  {
    
    cout<<p<<" ";
    p+=104+((i-1)*32);
    i++;
  }while(i<=n);
   
  return 0;
}
