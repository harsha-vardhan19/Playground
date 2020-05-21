#include<iostream>
using namespace std;
int main()
{
  int q,a[100],ele,k;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>q;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<q;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>k;
  if(k>q){
    cout<<"Invalid Input"; return 0;}
  for(int i=q;i>=k-1;i--)
    a[i+1]=a[i];
  cout<<"Enter the value to insert"<<endl;
  cin>>a[k-1];
  cout<<"Array after insertion is"<<endl;
  for(int i=0;i<=q;i++)
    cout<<a[i]<<endl;
    
}
