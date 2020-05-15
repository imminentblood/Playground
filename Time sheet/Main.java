#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun,mon,tue,wed,thr,fri,sat;
  int b,br,r1,r2,r3,r4,r5,r6,r7,r8=0;
  int ed,td,tr;
  cin>>sun>>mon>>tue>>wed>>thr>>fri>>sat;
  r1=sun*150;
  r7=sat*125;
  if(mon<=8)
  {
    r2 = mon*100;
  }
    else if(mon>8)
    {
      b=mon-8;
      br=(b*100)+b*15;
      r2=br+800;
    }
      if(tue<=8)
      {
        r3= tue*100;
      }
        else if(tue>8)
        {
          b=tue-8;
          br=b*15+(b*100);
          r3=br+800;
         }
      if(wed<=8)
      {
        r4=wed*100;
      }
      else if(wed>8)
      {
        b=wed-8;
        br=b*15+(b*100);
        r4=br+800;
      }
      if(thr<=8)
      {
        r5=thr*100;
      }
      else if(thr>8)
      {
        b=thr-8;
        br=b*15+(b*100);
        r5=br+800;
      }
      if(fri<=8)
      {
        r6=fri*100;
      }
      else if(fri>8)
      {
        b=fri-8;
        br=b*15+(b*100);
        r6=br+800;
      }
      td=mon+tue+wed+thr+fri;
      if(td>40)
      {
        ed=td-40;
        r8=(ed*25)+(ed*100);
      }
      tr=r1+r2+r3+r4+r5+r6+r7+r8;
      cout<<tr;  
}
/*#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{*/
	/*int d0,d1,d2,d3,d4,d5,d6,d7;
	cin>>d0>>d1>>d2>>d3>>d4>>d5>>d6>>d7;*/
	/*int day[7],sum = 0;
	for(int i = 0; i < 7; i++)
	cin>>day[i];
	if(day[0] != 0 )
		{
      		
			if(day[0] <= 8)
            {
              sum += day[0] * 100;
              sum += (sum * 0.5);
            }
			
			else if (day[0] > 8 && day[0] <= 40)
            {
              sum += day[0] * 100 + (abs(day[0]-8) * 15);
              sum += (sum * 0.5);
            }
			
			else if (day[0] > 40)
            {*/
              /*int w = abs(day[0]-40);
              if(w <= 7)
			  sum += day[0] * 100 + ((w) * 25);
              else if(w > 7)
                sum += day[0] * 100;*/
             /* sum += day[0] * 100 + (abs(day[0]-40) * 25);
            }
			
		}
	else if(day[6] != 0)
	{
		if(day[6] <= 8)
        {
          sum += day[6] * 100;
          sum += (sum * 0.4);
        }
		
		else if (day[6] > 8 && day[6] <= 40)
        {
          sum += day[6] * 100 + (abs(day[6]-8) * 15);
          sum += (sum * 0.4);
        }
		
		else if (day[6] > 40)
		sum += day[6] * 100 + (abs(day[6]-40) * 25);
		sum += (sum * 0.4);		
	}
	for(int i = 1; i < 6; i++)
	{
		if(day[i] <= 8)
		sum += day[i] * 100;
		else if (day[i] > 8 && day[i] <= 40)
		sum += day[i] * 100 + (abs(day[i]-8) * 15);
		else if (day[i] > 40)
		sum += day[i] * 100 + (abs(day[i]-40) * 25);
	}
	cout<<sum;
	return 0;
}*/