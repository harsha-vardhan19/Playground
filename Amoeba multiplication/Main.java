#include<iostream>
using namespace std;
int main()
{
  int n,f;
  cin>>n;
  if(n==1)
    cout<<0;
  if(n==2)
    cout<<1;
  for(int n1=0,n2=1,i=3;i<=n;i++)
  {
    f=n1+n2;
    n1=n2;
    n2=f;}
  cout<<f;
  
}