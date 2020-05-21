//STAGE 64
#include<iostream>
using namespace std;
int main()
{
  char in[30],out[30];
  cin>>in;
  int a=0;
  for(int b=0;in[b]!='\0';b++)
    if((in[b]>=65&&in[b]<=91)||(in[b]>=97&&in[b]<=123))
      out[a++]=in[b];
     out[a]='\0';
  cout<<out;
}
