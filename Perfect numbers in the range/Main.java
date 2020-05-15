#include <iostream>

using namespace std;

bool isAfactor(int, int);

int main()
{
	int startVal, endVal, num = 0, newNum, sum;

	cin >> startVal;

	cin >> endVal;

	for (num = startVal; num <= endVal; num++)
	{
		sum = 0;
		for (newNum = 1; newNum < num; newNum++) 
		{
			if (isAfactor(num, newNum))
				sum = sum + newNum;
		}
		if (sum == num)
		{
			cout << num  << " ";
		}
                if (sum != num)
                {
                        continue;
                }
	}


	return 0;
}

bool isAfactor(int num1, int num2)
{

	if (num1 % num2 == 0)
		return true;
	else
		return false;
}