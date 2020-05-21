#include<iostream>
int main()
{
  int n,count=0;
  std::cin>>n;
  if(n==0)
  {
   std::cout<<1;
    return 0;
  }
  while(n>0)
  {count++;
  n/=10;
  }
  std::cout<<(count);  
}