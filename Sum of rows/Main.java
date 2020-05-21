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
   for(int i=0;i<a;i++)
   {int max=0;
     for(int j=0;j<b;j++)
         max+=ar[i][j];
     cout<<max<<endl;
   }
   
}