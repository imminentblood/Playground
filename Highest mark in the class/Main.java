#include<bits/stdc++.h>
using namespace std;
int main()
{
  // Type your code here
  int s;
  cin>>s;
  int arr[s];
  for(int i = 0; i < s; i++)
    cin>>arr[i];
  int len = sizeof(arr) / sizeof(arr[0]);
  sort(arr , arr + len);
  cout<<arr[s-1];
}