#include<stdio.h>
int main()
{
  int j;
  scanf("%d",&j);
  int arr[j];
  //printf("Enter your elements");
  for(int k=0;k<j;k++)
  {
    scanf("%d",&arr[k]);
  }
  int beep=arr[0];
  for(int m=1;m<j;m++)
  {
     if(beep<arr[m])
     {
         beep=arr[m];
     }

    
  }
  printf("%d",beep);
  
  //Type your code here
  return 0;
}