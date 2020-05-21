#include<iostream>
using namespace std;
int main()
{
  int w,v,n1,n2,t1,t2;
  std::cin>>v;
  std::cin>>n1;
  std::cin>>n2;
  t1=n1*75;
  t2=n2*30;
  w=t1+t2;
  if(w<=v)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}