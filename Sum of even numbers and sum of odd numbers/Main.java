#include<iostream>
using namespace std;
int main()
{
  int n,even=0,odd=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
   int temp;
    cin>>temp;
    if(temp%2==0)
      even+=temp;
    else
      odd+=temp;
  }
  cout<<"The sum of the even numbers in the array is "<<even<<endl;
  cout<<"The sum of the odd numbers in the array is "<<odd;
  
}
