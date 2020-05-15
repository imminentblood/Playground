#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,count=0;
  cin>>n;
  cout<<n<<endl;
  while(n != 1)
  {
    count++;
    if(n % 2 == 0)
    {
      n = n / 2;
      cout<<n<<endl;
    }
    else
    {
      n = n * 3 + 1;
      cout<<n<<endl;
    }
    
  }
  cout<<count;
  return 0;
}