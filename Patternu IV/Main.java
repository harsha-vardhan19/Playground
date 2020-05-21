#include <iostream>
using namespace std;
int main() {
    int n,count=1,k=1;
    cin>>n;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++)
      {
        if(count==n)
        {
          count=0;
          k++;
        }
        if(i%2==0)
        { 
          cout<<k;
           count++;
        }
        else
        {
          int a=n-count;
          for(int l=0;l<count;l++)
            cout<<k+1;
          for(int l=0;l<(n-count);l++)
            cout<<k;
          k++;
          break;
        }
        
      }cout<<endl;}
    return 0;
}
