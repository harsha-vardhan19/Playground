#include<iostream>
using namespace std;
int main()
{
  	float mil,mil1;
  	float pet,dis;
  	cin>>mil;
  	cin>>pet;
  	cin>>dis;
  	mil1=dis/pet;
  	if(mil1>mil)
    {
      std::cout<<"Cannot reach";
    }
  	else
    {
      std::cout<<"Can reach";
    }
}
