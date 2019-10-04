#include <stdio.h>
#include <string.h>
int main()
{
  int n,b,c=0,k;
  scanf("%d",&n);
  int arr1[n];
  for(int i=0;i<n;i++)
  {
     scanf("%d",&arr1[i]);
  }
  scanf("%d",&k);
  for(int i=0;i<n;i++)
  {
      for(int j=i+1;j<n;j++)
      {
          if(arr1[i]>arr1[j])
          {
           int temp=arr1[i];
           arr1[i]=arr1[j];
           arr1[j]=temp;
          }
      }
  }
  printf("%d",arr1[n-k]);
  
 
  return 0;
}
