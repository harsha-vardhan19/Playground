#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int ball,tar,sc,bal;
  cin>>ball>>tar>>sc>>bal;
  cout<<(ball/6)<<endl;
  float a;
  int temp;
  temp=bal/6;
  a=temp+(((bal/6.0)-temp)*0.6);
  cout<<a<<endl;
  float b=sc/a;
  cout<< setprecision(1) << fixed <<b<<endl;
  cout<< setprecision(1) << fixed <<(tar/(ball/6.0))<<endl;
  
  if(b>(tar/(ball/6.0)))
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
  
}