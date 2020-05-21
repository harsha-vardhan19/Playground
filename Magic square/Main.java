#include<iostream>
using namespace std;
int main()
{
 int p;
  cin>>p;
  int a[p][p];
  for(int i=0;i<p;i++)
    for(int j=0;j<p;j++)
      cin>>a[i][j];
  int n1=0,n2=0;
  for(int i=0;i<p;i++)
    for(int j=0;j<p;j++)
    {
     if(i==j)
       n1+=a[i][j];
      if(i==0)
      n2+=a[i][j];
    }
  if(n1==n2)
    cout<<"Yes";
  else
    cout<<"No";
}
