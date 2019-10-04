#include<stdio.h>
int main()
{
  int b=0;
  int f=0;
  int j;
 
  scanf("%d",&j);
  
  int arr[j];
 
  for(int z=0;z<j;z++)
  {
    scanf("%d",&arr[z]);
  }
  for(int m=0;m<j/2;m++)
  {
      b=b+arr[m];
  }
  for(int k=j/2;k<j;k++)
  {
     f=f+arr[k];
  }
  if(f==b)
  {
      printf("Perfect Batch");
  }
  else
  {
  printf("Not a Perfect Batch");
  }
  return 0;
}
