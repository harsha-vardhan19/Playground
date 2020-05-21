#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
 int i=0;
  cout<<n<<endl;
  while(n!=1)
  {
    i++;
    if(n%2==0)
   n/=2;
  else
    n=(3*n)+1;
    cout<<n<<endl;
  }
  cout<<i<<endl;
}