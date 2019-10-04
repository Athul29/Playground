#include<stdio.h>
int main()
{
 int j;
  int d;
 scanf("%d",&j);
 int arr[j];
 int beep= arr[0];
  for(int z=1;z<j;z++)
  {
      if(beep<arr[z])
      {
         beep=arr[z];
      }
    d=z;
  }
  printf("%d",d);
}
