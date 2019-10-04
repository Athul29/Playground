#include<stdio.h>
#include<string.h>
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int d=0;d<n/2;d++)
    {
        for(int j=d+1;j<n/2;j++)
        {
            if(arr[d]>arr[j])
            {
                int temp=arr[d];
                arr[d]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int f=0;f<n/2;f++)
    {
        printf("%d ",arr[f]);
    }
    for(int f=n/2;f<n;f++)
    {
        printf("%d ",arr[f]);
    }
}