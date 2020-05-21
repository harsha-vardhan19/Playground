#include <iostream>
using namespace std;
 
int main()
{
  int m, n, c, d, first[10][10], second[10][10], sum[10][10];
  std::cin >> m >> n;
 
  for (c = 0; c < m; c++)
    for (d = 0; d < n; d++)
      std::cin >> first[c][d]; 
  for (c = 0; c < m; c++)
    for (d = 0; d < n; d++)
        std::cin >> second[c][d];
 
  for (c = 0; c < m; c++)
    for (d = 0; d < n; d++)
      sum[c][d] = first[c][d] + second[c][d];
 
  for (c = 0; c < m; c++)
  {
    for (d = 0; d < n; d++)
      std::cout<<sum[c][d]<<" ";
 
    std::cout<<endl;
  }
 
  return 0;
}