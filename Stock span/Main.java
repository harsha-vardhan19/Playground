#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"1"<<endl;
  for(int i=1,j=2;i<n;i++)
  {
    if(a[i-1]>=a[i])
      cout<<"1"<<endl;
    else
    {
      cout<<j<<endl;
      j+=2;
    }  } 
}
