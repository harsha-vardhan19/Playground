//STAGE 63
#include<iostream>
#include<string>
#include<cstring>
using namespace std;
int main()
{
 char str[100],str1[100];
  cin>>str;
  cin>>str1;
  if(strlen(str)==strlen(str1)){
    for(int p=0,k=strlen(str1)-1;p<strlen(str);p++,k--)
      if(str[p]!=str1[k])
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
