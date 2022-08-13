#include <iostream>
using namespace std;
// Calculate the first and last occurence of an element in a given sorted array.

int firstOcc(int arr[], int size, int k)
{
  int s = 0, e = size - 1;
  int mid = (s + e) / 2;
  int ans = 0;

  while (s <= e)
  {
    if (arr[mid] == k)
    {
      ans = mid;
      e = mid - 1; 
    }
    if (k > arr[mid])
    {
      s = mid + 1;
    }
    else if (k < arr[mid])
    {
      e = mid - 1;
    }
    mid = (s + e) / 2;
  }
  return ans;
}
int lastOcc(int arr[], int size, int k)
{
  int s = 0, e = size - 1;
  int mid = (s + e) / 2;
  int last = 0;

  while (s <= e)
  {
    if (arr[mid] == k)
    {
      last = mid;
      s = mid + 1;
    }
    if (k > arr[mid])
    {
      s = mid + 1;
    }
    else if (k < arr[mid])
    {
      e = mid - 1;
    }
    mid = (s + e) / 2;
  }
  return last;
}

int main()
{
  int arr[7] = {0, 1, 2, 3, 3 ,3, 4};

  cout << "fist is " << firstOcc(arr, 7, 3) << endl;

   cout << "lst is " << lastOcc(arr, 7, 3) << endl;

}
