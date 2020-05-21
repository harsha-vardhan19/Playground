#include <iostream>
#include<string>
#include<cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student s;
  gets(s.name);
  cin>>s.roll>>s.marks;
  cout<<endl<<"Student Details"<<endl<<"Name: "<<s.name<<endl<<"Roll: "<<s.roll<<endl<<"Marks: "<<s.marks;
}