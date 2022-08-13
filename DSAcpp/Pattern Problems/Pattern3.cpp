#include <iostream>
using namespace std;
// Pattern
// 1 1 1
// 2 2 2
// 3 3 3

int main()
{
  int n = 3; // taking input from user

  int i = 1;

  while (i <= n)
  {
    int j = 1;
    while (j <= n)
    {
      cout << i; // PRINT i
      j++;
    }
    cout << endl;
    i++;
  }
}