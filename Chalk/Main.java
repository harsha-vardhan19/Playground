#include<iostream>
using namespace std;
int sq(int m)
{
  int q=1;
  while(q*q<=m)
    q++;
 return q;
}
int main()
{
 int m;
  cin>>m;
 cout<< sq(m)+m;
}