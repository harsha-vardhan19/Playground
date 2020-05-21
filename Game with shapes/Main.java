#include<iostream>
using namespace std;
int main()
{
  int r,s;
  cin>>r>>s;
  if(r*2>s)
    cout<<"circle cannot be inside a square";
  else
    cout<<"circle can be inside a square";
}