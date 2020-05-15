#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int bx = 3, by = 4, x, y,num1,num2, root;
  cin>>x>>y;
  num1 = bx - x;
  num2 = by -y;
  root = (num1 * num1) + (num2 * num2);
  cout<<int(sqrt(root))<<endl;
  return 0;
}