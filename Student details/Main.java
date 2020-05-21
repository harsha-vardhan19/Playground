#include<iostream>
#include<string>
#include<cstring>
#include<bits/stdc++.h>
using namespace std;
int n;
  string name[100];
  string dept[5];
  int year[100];
  float gpa[100];
bool comparator(string a,string b)
{
    return a<b;
}

int main()
{
  
  cout<<"Enter the number of students"<<endl;
  cin>>n;
  string temp[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of student "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>name[i];
    temp[i]=name[i];
    cout<<"Enter department"<<endl;
    cin>>dept[i];
    cout<<"Enter year of study"<<endl;
    cin>>year[i];
    cout<<"Enter cgpa"<<endl;
    cin>>gpa[i];
  }
  sort(temp,temp+n,comparator);
   cout<<"Details of students"<<endl;
  for(int i=0;i<n;i++)
    {
    for(int j=0;j<n;j++)
    {
        if(temp[i]==name[j]){
     cout<<"Student "<<i+1<<endl;
     cout<<"Name:"<<name[j]<<endl;
     cout<<"Department:"<<dept[j]<<endl;
     cout<<"Year of study:"<<year[j]<<endl;
     cout<<"CGPA:"<<gpa[j]<<endl;break;}
    }
    }
}
