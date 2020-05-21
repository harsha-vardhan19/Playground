#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
  cin>>p>>r>>t;
  float si;
  cout<<(si=(p*t*r)/100)<<endl;
  float to;
  cout<<(to=p+si)<<endl;
  float di;
  cout<<(di=(si)*0.02)<<endl;
  cout<<(to-di);
  
}