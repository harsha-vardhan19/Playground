#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int k;
  cin>>k;
  int temp=k,n=0;
  while(temp!=0)
  {
    n++;temp/=10;
  }
   temp=k*k;
  int op=pow(10,n);
  int co=0;
  while(temp>0)
  {
    co+=temp%op;
    temp/=op;
  }
  if(co==k)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}
