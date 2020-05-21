#include<iostream>
using namespace std;
int main()
{
  int ch;
  cin>>ch;
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  switch(ch)
  {
    case 1:cout<<a+c<<"+"<<b+d<<"i";
           break;
    case 2:cout<<a-c<<"+"<<b-d<<"i";
           break;
    case 3:{int p1=a*c-b*d;
           int p2=a*d+b*c;
           cout<<p1<<p2<<"i";
            break;}
      default :cout<<"Invalid choice";
  }}