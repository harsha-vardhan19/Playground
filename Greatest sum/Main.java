#include<iostream>
using namespace std;
int main()
{
int a,b;
  cin>>a>>b;
  int ar[a][b];
  for(int i=0;i<a;i++)
    for(int j=0;j<b;j++)
      cin>>ar[i][j];
  cout<<"Sum of rows is ";
  int max,t=0;
   for(int i=0;i<a;i++){
     int sum=0;
     for(int j=0;j<b;j++)
       sum+=ar[i][j];
     if(i==0)
       max=sum;
     else
       if(max<sum)
       { max=sum;t=i;}
     cout<<sum<<" ";
   }
 cout<<endl<<"Row "<<t+1<<" has maximum sum";
  t=0;
   cout<<endl<<"Sum of columns is ";
  for(int i=0;i<b;i++){
     int sum=0;
     for(int j=0;j<a;j++)
       sum+=ar[j][i];
     if(i==0)
       max=sum;
     else
       if(max<sum)
       { max=sum;t=i;}
     cout<<sum<<" ";
   }
 cout<<endl<<"Column "<<t+1<<" has maximum sum";     
  
}
