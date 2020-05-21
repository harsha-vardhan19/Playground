#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int r=pow(a,b);

  if(r>=c)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
