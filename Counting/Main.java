//STAGE 66
#include<iostream>
#include<cstring>
using namespace std;
int main()
{
 char ok[1000];
int sp=0,count=0,vowels=0,num=0,i,n;
  cin.getline(ok,1000);
  n=strlen(ok);
  for(i=0;i<n;i++)
   {
    if(ok[i]==' ')
     count++;
    else
      if(ok[i]=='a'||ok[i]=='e'||ok[i]=='i'||ok[i]=='o'||ok[i]=='u'||ok[i]=='A'||ok[i]=='E'||ok[i]=='I'||ok[i]=='O'||ok[i]=='U')
      {
        vowels++;
      }
      else
      if(ok[i]>=48&&ok[i]<=57)
        num++;
     else
      if(!((ok[i]>=65&&ok[i]<=(65+26))||(ok[i]>=97&&ok[i]<=(97+26))))
        sp++;
   }
  cout<<"Vowels:"<<vowels<<endl;
  cout<<"Consonants:"<<(n-vowels-count-num-sp)<<endl;
  cout<<"White Spaces:"<<count<<endl;
  cout<<"Digits:"<<num<<endl;
  cout<<"Symbols:"<<sp;
}
