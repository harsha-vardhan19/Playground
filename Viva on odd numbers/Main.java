#include<iostream>
using namespace std;
int main()
{
  int count=0;
  float score=0.0;
  while(count<3)
  {
    int n;
    std::cin>>n;
    if(n<1){score-=1;;
      break;}
    if(n%2==0)
      score-=0.5;
    else{count++;
      score+=1;}
  }
  std::cout<<score;
}