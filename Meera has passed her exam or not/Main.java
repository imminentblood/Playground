#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,flag=1,meera;
  cin>>n;
  int arr[n];
  for(int i = 0; i < n; i++)
    cin>>arr[i];
  cin>>meera;
  for(int i = 0; i < n; i++)
  {
    if(meera == arr[i])
    {
      flag = 0;
      break;
    } 
  }
  if(flag == 0)
    cout<<"She passed her exam\n";
  else 
    cout<<"She failed\n";
  return 0;
}