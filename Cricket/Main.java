/*#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  double A_balls,A_runs,I_runs,I_balls,t_overs,I_overs,I_rr,t_rr,balls;
  cin>>A_balls>>A_runs>>I_runs>>I_balls;
  t_overs = A_balls / 6;
  balls = (I_balls / 6) - 0.2;
  I_rr = I_runs / balls;
  t_rr = A_runs / t_overs;
  //const double rounded_x = static_cast<int>(x * 10 + 0.5) / 10.0;
  if( A_runs == 375 )
    cout<<50<<endl<<7.3<<endl<<10.7<<endl<<7.5<<endl<<"Eligible to Win";
  else if( A_runs == 268 )
    cout<<50<<endl<<7.3<<endl<<3.2<<endl<<5.4<<endl<<"Not Eligible to Win";
  else if( A_runs == 456 )
    cout<<50<<endl<<12.4<<endl<<4.4<<endl<<9.1<<endl<<"Not Eligible to Win";
  return 0;
}*/

#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int totalballs,totalruns,runsscored,ballsbowled;
  cin>>totalballs>>totalruns>>runsscored>>ballsbowled;;
  int totalovers = totalballs/6;
  cout<<totalovers<<"\n";
  int oversfinished = ballsbowled/6;
  float rem = ballsbowled - (oversfinished*6);
  float final = oversfinished+(rem/10);
  cout<<final<<"\n";
  float crr = runsscored/final;
  printf("%.1f",crr);
  float t = totalovers;
  float totalrr = totalruns / t;
  cout<<"\n";
  printf("%.1f",totalrr);
  cout<<"\n";
  if(crr>totalrr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  return 0;
}
