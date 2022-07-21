#include <iostream>
using namespace std;

int binarySearch(int arr[], int size, int key)
{
  int start = 0;
  int end = size - 1;

  /*
  To calculate Mid;
  
  int mid= (start + end) /2  
    
  To avoid Integer Overflow we use 
  */
  int mid = start + (end - start) / 2;

  while (start <= end)
  {
    if (arr[mid] == key)
    {
      return mid;
    }

    // go to right part
    if (key > arr[mid])
    {
      start = mid + 1;
    }
    else // key < arr[mid] | LEFT part
    {
      end = mid - 1;
    }
    mid = start + (end - start) / 2;
  }
  return -1;
}

int main()
{
  int even[6] = {2, 4, 6, 8, 12, 18};
  int odd[5] = {3, 8, 11, 14, 16};

  int index = binarySearch(even, 6, 12);

  cout << "index of 12 is: " << index << endl;
}
