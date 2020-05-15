#include<iostream>
#include<math.h>
using namespace std;

void sumofnum(int *a, int n)
{
  int ab,esum=0,osum=0;
  for(int i = 0; i < n; i++)
  {
    ab = abs(*(a+i));
    if(ab % 2 == 0)
      esum += *(a+i);
    else
      osum += *(a+i);
  }
  cout<<"The sum of the even numbers in the array is "<<esum<<endl;
  cout<<"The sum of the odd numbers in the array is "<<osum<<endl;
}

int main()
{
  //Type your code here.
  int n,arr[15];
  cin>>n;
  for(int i = 0; i < n; i++)
  {
    cin>>arr[i];
  }
  sumofnum(arr,n);
  return 0;
}