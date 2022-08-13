#include <iostream>
using namespace std;
// Pattern
// 1 2 3
// 4 5 6
// 7 8 9

int main()
{
  int n = 3; // taking input from user

  int i = 1;
  int count = 1;
  while (i <= n)
  {
    int j = 1; // Column
    while (j <= n)
    {
      cout << count; // PRINT i
      count++;
      j++;
    }
    cout << endl;
    i++;
  }
}