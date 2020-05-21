#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  cout<<"The treasure is in box which has number ";
  if(a>b&&a>c)
  {
    if(b>c)
      cout<<b;
    else
      cout<<c;
  }
  else
  if(b>a && b>c)
  {
    if(a>c)
      cout<<a;
    else
      cout<<c; 
  }
  else
  {
    if(a>b)
      cout<<a;
    else
      cout<<b; 
  }
    for(int i=10;i>=1;i--)
      if(a%i==0&&b%i==0&&c%i==0)
      {cout<<"\nThe code to open the box is "<<i; return 0;}
}