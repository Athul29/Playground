#include<stdio.h>
int main()
{
int size,b;
scanf("%d ",&size);
int arr[size];
  for( int m=0;m<size;m++)
  {
    scanf("%d",&arr[m]);
  }

for( int i=0;i<size-1;i++)
{
    for(int j=i+1;j<size;j++)
    {
        for( b=j+1;b<size;b++)
        {
          
            printf("(%d, %d, %d) ",arr[i],arr[j],arr[b]);
          
        }
      
        
    }  
  printf("\n");
}
}