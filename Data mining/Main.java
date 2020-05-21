#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int i=1;
  int c1=0,c2=0;
  while(n!=0)
  {
    if(i==0)
    {
      c1+=n%10;
      i=1;
    }
    else
    {
      c2+=n%10;
      i=0;
    }
    n/=10;
  }
  if(c1==c2)
    cout<<"Yes";
  else
    cout<<"No";
}



