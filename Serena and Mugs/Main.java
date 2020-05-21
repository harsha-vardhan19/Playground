#include<iostream>
using namespace std;
int main()
{
  int o,p;
  cin>>o>>p;
  int c=0,temp;
  for(int q=0;q<o;q++)
  {
    cin>>temp;
    c+=temp;
  }
  if(c<=p)
    cout<<"YES";
  else
    cout<<"NO";
    
    
}
