#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int box1,box2,box3,slarg;
  cin>>box1>>box2>>box3;
  if( (box1>box2 && box1<box3) || (box1<box2 && box1>box3) )
    slarg = box1;
  else if( (box2>box1 && box2<box3) || (box2<box1 && box2 > box3))
    slarg = box2;
  else if( ( box3>box1&& box3<box2) || (box3<box1 && box3 > box2))
    slarg = box3;
  cout<<"The treasure is in box which has number "<<slarg;
  for(int i = 10; i >= 1; i--)
  {
    if( (box1 % i == 0) && (box2 % i == 0) && (box3 % i == 0) )
    {
      cout<<"\nThe code to open the box is "<<i;
      break;
    }
  }
  return 0;
}