#include <iostream>
using namespace std;
// Pattern Right Angle Triangle
// 1
// 2 3
// 3 4 5
// 4 5 6 7

int main()
{
  int n = 4; // taking input from user

  int i = 1; // row

  while (i <= n)
  {
    int j = 1; // Column
    int val = i;
    while (j <= i)
    {
      cout << val; // PRINT i
      val++;
      j++;
    }
    cout << endl;
    i++;
  }
}