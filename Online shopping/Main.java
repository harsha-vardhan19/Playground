#include<iostream>
using namespace std;
int main()
{
  		int fc,fd,fs,ft;
  		int sc,sd,ss,st;
      	int ac,ad,as,at;
 			std::cin>>fc;
  			std::cin>>fd;
  			std::cin>>fs;
  			std::cin>>sc;
  			std::cin>>sd;
  			std::cin>>ss;
  			std::cin>>ac;
  			std::cin>>ad;
  			std::cin>>as;
  			ft=fc+fs-(fc/100*fd);
  			st=sc+ss-(sc/100*sd);
  			at=ac+as-(ac/100*ad);
  			std::cout<<"In Flipkart Rs."<<ft;
    		std::cout<<"\nIn Snapdeal Rs."<<st;
    		std::cout<<"\nIn Amazon Rs."<<at;
		      if(ft>st && st<at)
              {
                std::cout<<"\nHe will prefer Snapdeal";
              }
     		  if(st>at && at<ft)
              {
                	std::cout<<"\nHe will prefer Amazon";
              }
      		  if(st>=ft && ft<at)
 			 {
              
                	std::cout<<"\nHe will prefer Flipkart";
              }
  			 
        
 
              
}