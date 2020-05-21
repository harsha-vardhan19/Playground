#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int q=1;q<=n;q++)
  {
    if(q%2==0)
      cout<<(q*q-2)<<" ";
    else
      cout<<(q*q-1)<<" ";
}}
