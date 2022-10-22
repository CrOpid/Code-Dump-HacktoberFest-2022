#include <stdio.h>
int min(int x, int y) { return (x <= y) ? x : y; }
int fibonacciSearch(int arr[], int x, int n)
{
    int r = 0; 
    int s = 1; 
    int fib = r + s; 
    while (fib < n) {
        r = s;
        s = fib;
        fib = r + s;
    }
    int offset = -1;
 
    while (fib > 1) {
        int i = min(offset + r, n - 1);
        if (arr[i] < x) {
            fib = s;
            s = r;
            r = fib - s;
            offset = i;
        }
        else if (arr[i] > x) {
            fib = r;
            s = s - r;
            r = fib - s;
        }
        else
            return i;
    }
    if (s && arr[offset + 1] == x)
        return offset + 1;
    return -1;
}
/* driver code*/
int main(void)
{
    int arr[]
        = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100,235};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 235;
      int index = fibonacciSearch(arr, x, n);
  if(index>=0)
    printf("Found at index: %d",index);
  else
    printf("%d isn't present in the array",x);
    return 0;
}
