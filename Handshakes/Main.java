#include<bits/stdc++.h> 
using namespace std; 
  
// Calculating the maximum number of handshake 
// using derived formula. 
int maxHandshake(int n) 
{ 
  return (n * (n - 1))/ 2; 
} 
  
// Driver Code 
int main() 
{ 
  int n ;
  std::cin>>n;
  cout << maxHandshake(n) <<endl; 
  
  return 0; 
}  