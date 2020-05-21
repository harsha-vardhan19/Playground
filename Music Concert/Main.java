#include<iostream>
using namespace std;
int main(){
 int n;
  cin>>n;
  int f=0,m=0;
  for(int i=0;i<n;i++)
  {
    int temp;
    cin>>temp;
   if(temp%2==0)
     f++;
   else
     m++;
  }
  cout<<m<<endl<<f;
  return 0;
}
