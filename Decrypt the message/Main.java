#include<iostream>
using namespace std;

// function to check the no. is "prime or not"
int isPerfect(int sum0)
{
	int sum = 0;
	for(int i = 1; i < sum0; i++)
	{
		if(sum0 % i == 0)
		sum += i;
	}
	return sum;
}

//main function
int main()
{
  int res,num,sum0;
  cin>>res>>num; 
  sum0 = res+num;
  if(isPerfect(sum0) == sum0)
  
    cout<<"They can read the message\n";

  else 
    cout<<"They can't read the message\n";
  
  return 0;
}