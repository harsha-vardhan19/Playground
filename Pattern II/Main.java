#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int p=1;
  for(int i=0;i<n;i++)
  {
    if(i%2==0)
      for(int j=0;j<=i;j++)
      {
         cout<<p++;
         if((j+1)<=i)
             cout<<"*";
      }
    else
      for(int j=0,k=p+i;j<=i;j++,p++)
      {
         cout<<k--;
         if((j+1)<=i)
             cout<<"*";
      }
    cout<<endl;
  }
  return 0;
}
        
