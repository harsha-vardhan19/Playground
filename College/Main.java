//STAGE 73
#include<iostream>
#include<string>
#include<cstring>
using namespace std;
int p,l;
  string name[100];
  string dept[5];
  int year[100];
  float gpa[100];
void sort() 
{ 
    for (int p=1 ;p<l; p++) 
    { 
        string temp = name[p]; 
        string temp1=dept[p];
        int temp2=year[p];
        float temp3=gpa[p];
        int j = p - 1; 
        while (j >= 0 && temp.length() < name[j].length()) 
        { 
            name[j+1] = name[j]; 
            dept[j+1] = dept[j]; 
            year[j+1] = year[j]; 
            gpa[j+1] = gpa[j]; 
            j--; 
        } 
       name[j+1] = temp; 
       dept[j+1] = temp1; 
       year[j+1] = temp2; 
       gpa[j+1] = temp3; 
    } 
} 
int main()
{
  	int l;
  cout<<"Enter the number of colleges"<<endl;
  cin>>l;
  for(int p=0;p<l;p++)
  {
    cout<<"Enter the details of college "<<p+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>name[p];
    cout<<"Enter city"<<endl;
    cin>>dept[p];
    cout<<"Enter year of establishment"<<endl;
    cin>>year[p];
    cout<<"Enter pass percentage"<<endl;
    cin>>gpa[p];
  }
  sort();
  
  cout<<"Details of colleges"<<endl;
  for(int p=0;p<l;p++)
  {
    cout<<"College:"<<p+1<<endl;
    cout<<"Name:"<<name[p]<<endl;
    cout<<"City:"<<dept[p]<<endl;
    cout<<"Year of establishment:"<<year[p]<<endl;
    cout<<"Pass percentage:"<<gpa[p]<<endl;
    }
}
