#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int n;
  float a;
  cin>>n>>a;
  if(n<=2)
    a=a+(a/2.0);
  else
    if(n==3)
      a=a*2;
    else
    {
      printf("Number of items is more");
      return 0;
    }
  cout<<setprecision(2) << fixed <<a;
    
}