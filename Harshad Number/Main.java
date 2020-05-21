#include<iostream>
using namespace std;
int main()
{
  int m,n,i,sum=0;
  std::cin>>n;
  m=n;
  while(n!=0)
  {
    i=n%10;
    n=n/10;
    sum=sum+i;
  }
  if(m%sum==0)
  {
    std::cout<<"Harshad Number";
  }
    else
    {
      std::cout<<"Not Harshad Number";
    }
} 
        
