#include<iostream>
int main()
{
  	int year;
  	std::cin>>year;
  	if((year%4==0 && year%100!=0) || year%400==0)
    {
      	std::cout<<"Vicky can celebrate his birthday.";
    }
  else
  {
    std::cout<<"Vicky can't celebrate.";
  }
}