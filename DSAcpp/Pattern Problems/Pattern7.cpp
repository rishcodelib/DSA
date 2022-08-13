#include <iostream>
using namespace std;
// Pattern Right Angle Triangle
// A A A
// B B B
// C C C

int main()
{
  int n = 3; // taking input from user

  int i = 1; // row

  while (i <= n)
  {
    int j = 1; // Column

    while (j <= n)
    {
      char ch = 'A' + i - 1;
      cout << ch; // PRINT i

      j++;
    }
    cout << endl;
    i++;
  }
}