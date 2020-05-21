#include<iostream>

int main()
{
 	int m,n,t,sfirst=2,slast;
  	std::cin>>m;
  	std::cin>>n;
  	std::cin>>t;
  	int arr[m][n];
  	bool flag=false;
  	int ele=0;
  	slast=(n-1);
  	for(int i=1;i<=m;i++)
    {
      for(int j=1;j<=n;j++)
      {
            ele=ele+1;    	
        	arr[j][i]=ele;
        	std::cin>>arr[j][i];          	       
      }     
    }
   	for(int i=1;i<=m;i++)
    {
      for(int j=1;j<=n;j++)
      {
       	if((arr[i][j] == t) && flag==false && (j==sfirst || j==slast))
        {
          flag=true;
          break;
        }
      }
    }
  	if(flag==true)
    {
      std::cout<<"It is a mango tree";
    }
  	else
    {
      std::cout<<"It is not a mango tree";
    }   
}