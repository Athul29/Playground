#include<stdio.h>
int main()
{
  int j;
  int c=0;
  int f=0;
  scanf("%d",&j);
  int arr[j];
  int search_elem_1;
  int search_elem_2;
  for(int k=0;k<j;k++)
  {
    scanf("%d",&arr[k]);
  }
  scanf("%d",&search_elem_1);
  scanf("%d",&search_elem_2);
  for(int m=0;m<j;m++)
  {
    if(arr[m]== search_elem_1)
    {
      printf("%d \n",m);
      c=1;
    }
      
     if(arr[m]== search_elem_2)
      {
          printf("%d",m);
       f=1;
          
      }
   }
  if (c==0 || f==0)
  {
    printf("-1");
  }
  
  //Type your code here
  return 0;
}