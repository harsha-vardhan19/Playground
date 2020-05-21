#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int max;
  (a>b && a>c)?max=a:(b>c)?max=b:max=c;
  for(int i=max;i>=1;i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
      if(i==d)
      {cout<<"Answer is correct.";
       return 0;
      }
  }
  cout<<"Answer is wrong.";
  return 0;
}