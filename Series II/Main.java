#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int q=1,p=121;
  do
  {
    
    cout<<p<<" ";
    p+=104+((q-1)*32);
    q++;
  }while(q<=n);
   
  return 0;
}
