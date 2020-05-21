#include<iostream>
using namespace std;
int main()
{
  int n,m,temp,max;
  cin>>n>>m;
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      {
        cin>>temp;
        if(i==0&&j==0)
          max=temp;
        if(max<temp)
           max=temp;}
  cout<<"The maximum element is "<<max;
  
}
