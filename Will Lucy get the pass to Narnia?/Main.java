#include<iostream>
int main()
{
  	int a,b,x;
  	std::cout<<"Enter first number : ";
  	std::cin>>a;
  	std::cout<<"Enter second number : ";
  	std::cin>>b;
  	std::cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
  	std::cin>>x;
     switch(x)
     {
         case 1:std::cout<<"\n"<<a+b;
         		break;
         case 2:std::cout<<"\n"<<a-b;
         		break;
         case 3:std::cout<<"\n"<<a*b;
         		break;
         case 4:std::cout<<"\n"<<a/b;
         		break;
         case 5:std::cout<<"\n"<<a%b;
         		break;
       default:std::cout<<"\nInvalid operation";
              	break;
     }
}