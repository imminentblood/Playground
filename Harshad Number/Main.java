#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,rem,sum=0;
  cin>>num;
  int temp = num;
  while(num != 0)
  {
    rem = num % 10;
    sum += rem;
    num /= 10;
  }
  if(temp % sum == 0)
    cout<<"Harshad Number\n";
  else
    cout<<"Not Harshad Number\n";
  return 0;
}