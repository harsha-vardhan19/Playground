#include<iostream>
using namespace std;
int main()
{
  int a;
  float s;
  cin>>a>>s;
  if(s>12)
  {
    if(a>13)
     cout<<"$5.00";
    else
      cout<<"$2.00";
  }
  else
   {
    if(a>13)
     cout<<"$8.00";
    else
      cout<<"$4.00";
  } 
}