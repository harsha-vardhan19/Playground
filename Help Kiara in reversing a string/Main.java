#include <iostream>
#include<string>
#include<cstring>
int main()
{
char str[100], rev[100];     
int count = 0, end, i=0;    
std::cin.getline(str,100);

for(int j=strlen(str)-1;j>=0;j--)
  rev[i++]=str[j];
 rev[i]='\0';
  std::cout<<rev;
}