#include<iostream>
using namespace std;
int main()
{
  int w1,w2,p1,p2,total;
  cin>>w1>>p1>>w2>>p2;
  total=w1+w2;
  total+=(p1+p2)/100;
  cout<<total<<endl<<((p1+p2)%100);
}