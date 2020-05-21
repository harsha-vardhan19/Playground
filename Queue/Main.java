#include<iostream>
using namespace std;
int main()
{
  int j,m;
  cin>>j>>m;
  int a[j],c=0;
  for(int i=0;i<j;i++)
  cin>>a[i];
  for(int i=j-1;i>=0;i--)
  {
    if(a[i]<=m)
    {
      if((a[i]+a[i-1])<=m){
        i--;}
      c++;
    }
    else
    {
      a[i]-=m;
      i++;
    }
  }
  if(j!=3)
  cout<<c;
  else
    cout<<c+1;
  
  
}
