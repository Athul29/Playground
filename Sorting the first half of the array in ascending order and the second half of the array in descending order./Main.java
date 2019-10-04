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
   for(int m=n/2;m<n;m++)
    {
        for(int p=m+1;p<n;p++)
        {
            if(arr[m]<arr[p])
            {
                int temp=arr[m];
                arr[m]=arr[p];
                arr[p]=temp;
            }
        }
    }
    for(int f=0;f<n;f++)
    {
        printf("%d ",arr[f]);
    }
    
}