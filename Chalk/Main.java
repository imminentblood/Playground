/*#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  n = n+sqrt(n);
  cout<<static_cast<int>(n)+1;
  return 0;
}*/
#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int n;
	cin>>n;
	float sq = 1/sqrt(n);
	float m = sq * n;
	float sum = m + n;
	while(m >0)
	{
		m = sq * int(m);
		sum += m;
		if(m < 1)
		m = 0;
	}
	cout<<int(sum);
	return 0;
}