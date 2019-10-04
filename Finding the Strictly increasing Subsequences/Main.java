#include <stdio.h>
#include<string.h>  
int main()
{
  int temp=0;
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int j=0;j<n;j++)
    {
        for(int k=j+1;k<n;k++)
        {
            if(arr[j]<arr[k])
            {
                
                if(temp<arr[k])
                {
                  temp=arr[k];
                    printf("%d,%d \n",arr[j] ,arr[k]);
                }
            }
        }
      temp=0;
    }
  return 0;
}
