//STAGE 75
#include<iostream>
using namespace std;
struct Distance {
    int ft;
    float in;
} d1, d2, sumOfDistances;

int main() {
   cin>>d1.ft;
   cin>>d1.in;
   cin>>d2.ft;
   cin>>d2.in;
   sumOfDistances.ft=d1.ft+d2.ft;
   sumOfDistances.in=d1.in+d2.in;
    if (sumOfDistances.in>12.0) {
        sumOfDistances.in = sumOfDistances.in-12.0;
        ++sumOfDistances.ft;
    }
  cout<<sumOfDistances.ft<<"\'-"<<sumOfDistances.in<<"\"";
    return 0;
}