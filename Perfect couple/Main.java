
#include <stdio.h>

int main()
{
    int size;
    scanf("%d",&size);
    int arr[size];
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    int m,f=0;
    scanf("%d",&m);
    for(int j=0;j<size;j++)
    {
        for(int l=j+1;l<size;l++)
        {
        
            
            if((arr[j]+arr[l])==m)
            {
               printf("Perfect couple:");
              printf(" %d %d", arr[j],arr[l]);
              f=1;
            }
            
         }
    }
    if(f==0)
      {
        printf("No perfect couple found!");
      }
} 
