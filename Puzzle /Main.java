#include<iostream>
using namespace std;
void ip(int a[][100],int r,int c)
{
  for(int i = 0; i < r; i++)
  {
    for(int j =0; j < c; j++)
    {
      cin>>a[i][j];
    }
  }
}
void op(int a[][100],int r,int c)
{
  for(int i = 0; i < c; i++)
  {
    for(int j =0; j < r; j++)
    {
      cout<<a[i][j]<<" ";
    }
    cout<<endl;
  }
}
int main()
{
    // Type your code here
  int r,c,arr[100][100],a[100][100];
  cin>>r>>c;
  ip(arr,r,c);
  for(int i = 0; i < c; i++)
  {
    for(int j = 0; j < r; j++)
    {
      a[i][j] = arr[j][i];
    }
  }
 op(a,r,c);
  return 0;
}