//STAGE 65
#include<iostream>
#include<string>
using namespace std;
int main()
{
 int m,i=0;
  string word[40];
  cin>>word[i++];
  while(word[i-1]!="####")
    cin>>word[i++];
  m=i;
  i=0;
  cout<<word[i]<<endl;
  int j=word[i].length();
  char t=word[i][j-1];
  word[i][0]=0;
  while(1)
  {
      for(j=0;j<m;j++)
      if(t==word[j][0])
      {
       cout<<word[j]<<endl;
       t=word[j][word[j].length()-1];
       word[j][0]=0;
       break;
      }
      
      if(j==m)
      break;
  }
  }
