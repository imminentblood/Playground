#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,nos=1;
  float count = 0.0;
  while(nos <= 3)
  {
  	cin>>n;
	if(n <0)
    {
      count -= 1.0;
      nos = 3;
      break;
    }
    else if(n % 2 != 0)
    {
      count += 1.0;
      nos++;
    }
    else if(n % 2 == 0)
    {
      count -= 0.5;
    }

  }
  printf("%.1f",count);
  return 0;
}