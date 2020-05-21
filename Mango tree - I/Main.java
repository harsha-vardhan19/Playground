#include<iostream>
using namespace std;
int main()
{
 int a,b,n,count=0;
  cin>>a>>b>>n;
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b&&count<n;j++)
    {
      count++;
      if(count==n&&(i==0||j==0))
      {
        cout<<"Yes";
        return 0;
      }
      
    }
  }
    cout<<"No";
    return 0;
}