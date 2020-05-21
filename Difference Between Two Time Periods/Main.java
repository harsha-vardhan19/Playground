//STAGE74
#include <iostream>
using namespace std;
struct TIME {
    int sec;
    int min;
    int hrs;
};

void differenceBetweenTimePeriod(struct TIME t1, struct TIME t2, struct TIME *diff);

int main() {
    struct TIME startTime, stopTime, diff;
   
  cin>>startTime.hrs>>startTime.min>>startTime.sec; 
  cin>>stopTime.hrs>>stopTime.min>>stopTime.sec;
    differenceBetweenTimePeriod(startTime, stopTime, &diff);
   cout<<diff.hrs<<":"<<diff.min<<":"<< diff.sec;
    return 0;
}

void differenceBetweenTimePeriod(struct TIME start, struct TIME stop, struct TIME *diff) {
    if (stop.sec > start.sec) {
        --start.min;
        start.sec += 60;
    }
    diff->sec = start.sec - stop.sec;
    if (stop.min > start.min) {
        --start.hrs;
        start.min += 60;
    }
    diff->min = start.min - stop.min;
    diff->hrs = start.hrs - stop.hrs;
}
