#include<iostream>
using namespace std;

void swap(int& c, int &d)
{
  int temp = c;
  c = d;
  d = temp;
}

int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b;
  swap(a,b);
  cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
  return 0;
}