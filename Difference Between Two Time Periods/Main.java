#include<iostream>
using namespace std;
typedef struct time
{
	int hr;
	int min;
	int sec;
}ti;

ti set(ti t)
{
	cin>>t.hr>>t.min>>t.sec;
	return t;
}

void timer(ti t1,ti t2)
{
	int hours,minutes,seconds;
	hours = t1.hr - t2.hr;
	if(t1.min < t2.min)
	{
		hours--;
		t1.min += 60;
		minutes = t1.min - t2.min;
	}
	else
	minutes = t1.min - t2.min;
	if(t1.sec < t2.sec)
	{
		minutes--;
		t1.sec += 60;
		seconds = t1.sec - t2.sec;
	}
	else
	seconds = t1.sec - t2.sec;
	cout<<hours<<":"<<minutes<<":"<<seconds<<endl;
}

int main()
{
	ti t1,t2;
	t1 = set(t1);
	t2 = set(t2);
	timer(t1,t2);
	return 0;	
}