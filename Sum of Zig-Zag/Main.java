#include<iostream>
using namespace std;
int main()
{
 int p,k;
  cin>>p>>k;
  int ar[p][k];
   for(int i=0;i<p;i++)
     for(int j=0;j<k;j++)
       cin>>ar[i][j];
  int max=0;
   for(int i=0;i<p;i++)
   {
     for(int j=0;j<k;j++)
       if(i==j||i==0||i==p-1)
       {
         max+=ar[i][j];
       }
   
   }
     cout<<"Sum of Zig-Zag pattern is "<<max<<endl;
}
