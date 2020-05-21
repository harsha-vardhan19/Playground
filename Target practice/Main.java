#include<iostream>
using namespace std;
int main()
{
  int n,count=0,c=0;
  cin>>n;
  while(n>count)
  {
    int temp;
    cin>>temp;
    count+=temp;
    c++;
  }
  cout<<"The number of turns is "<<c;
}