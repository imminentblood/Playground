#include<iostream>
using namespace std;
typedef struct distance
{
	int inches;
	float feet;
}dist;

dist set(dist d)
{
	cin>>d.inches>>d.feet;
	return d;
}

int rf(int f1,int count)
{
	
	if(f1 < 12)
	return 0;
	else
	{
		count++;
		rf(f1-12,count);
	}
	return count;
}
void setdist(dist d1,dist d2)
{
	int inch,count=0;
	float f;
	inch = d1.inches+d2.inches;
	f = d1.feet+d2.feet;
	int f1 = f;
	if(f1 >= 12)
	{
		count = rf(f1,count);
		inch += count;
		f -= count*12;
	}
	
	cout<<inch<<"\'-"<<f<<"\""<<endl;
}

int main()
{
	dist d1,d2;
	d1 = set(d1);
	d2 = set(d2);
	setdist(d1,d2);
	return 0;	
}