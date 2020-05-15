#include<iostream>
using namespace std;

void input(int arr[][100],int r,int c)
{
    for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      cin>>arr[i][j];
    }
  }
}
/*void adding(int arr[][100],int arr1[][100],arr2[][100],int r,int c)
{

}*/
void printing(int arr[][100],int r,int c)
{
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      cout<<arr[i][j]<<" ";
    }
    cout<<endl;
  }
}
int main()
{
    // Type your code here
  int r,c;
  cin>>r>>c;
  int arr1[100][100],arr2[100][100],arr[100][100];
  input(arr1,r,c);
  input(arr2,r,c);
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
        arr[i][j] = arr1[i][j] + arr2[i][j];
    }
  }
  printing(arr,r,c);
  return 0;
}