#include<iostream>
#include<string>
int main() 
{ 
	std::string fnum;
    std::cin>>fnum;
    char res[100];
    int i;
    for(i=0;fnum[i]!='.'&&fnum[i]!='\0';i++);
    if(fnum[i]!='\0'){
    for(int j=0;fnum[i]!='\0';i++,j++)
      res[j]=fnum[i+1];
    std::cout<<"Floating part is : "<<res;}
   else
    std::cout<<"Floating part is : ";
	//Type your code here
}