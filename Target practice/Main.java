/*#include<iostream>
using namespace std;
#include<string.h>
int main()
{
	int target,num,count = 0,score=0;
	string str;
	cin>>target;
  while(cin>>num)
  {
  	score += num;
  	count++;
  }
  if(score >= target)
  cout<<"The number of turns is "<<count;
  else
  cout<<"The number of turns is "<<count+1;
}*/


#include<stdio.h>
int main()
{
    int num, sum=0, count, n;
    scanf("%d", &num);
    for(count=0;sum<num;count++)
    {
        scanf("%d", &n);
        sum=sum+n; 
    }
    printf("The number of turns is %d", count);
    return 0;

}