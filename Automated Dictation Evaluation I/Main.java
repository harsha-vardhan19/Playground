//STAGE 61
#include<iostream>
#include<string>
#include<cstring>
using namespace std;
int main()
{
 char str3[100],str1[100];
  cin>>str3;
  cin>>str1;
  if(strlen(str3)==strlen(str1)){
    for(int i=0;i<strlen(str3);i++)
      if(str3[i]!=str1[i])
      {
        cout<<"It is wrong";
        return 0;
      }
    cout<<"It is correct";
}      
 else
   cout<<"It is wrong";
   return 0;
  
}