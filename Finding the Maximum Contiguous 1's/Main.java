#include <stdio.h>
#include <string.h>
int main()
{
    int n;
    int large=0;
    scanf("%d",&n);
    int arr[n];
    int count=0;
    int f=0;
    for (int i=0;i<n;i++) 
    {
        scanf("%d",&arr[i]);
    }
     for (int j=0;j<n;j++) 
    {
        if(arr[j]==1)
        {
            count++;
        }
        else
        {
            count=0;
        }
        if(large<count)
        {
           large=count;
        }
    }
    printf("%d",large);
    
}