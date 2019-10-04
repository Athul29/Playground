#include<stdio.h>
#include<string.h>
int main()
{
    int r,c;
    scanf("%d %d",&r,&c);
    int arr[100][100];
    int arr1[100][100];
    for(int i =0;i<r;i++)
    {
        for(int m=0;m<c;m++)
        {
            scanf("%d",&arr[i][m]);
        }
    }
    for(int i =0;i<r;i++)
    {
        for(int m=0;m<c;m++)
        {
            scanf("%d",&arr1[i][m]);
        }
    }
    for(int i =0;i<r;i++)
    {
        for(int m=0;m<c;m++)
        {
            arr[i][m]=arr[i][m]-arr1[i][m];
        }
    }
    for(int i =0;i<r;i++)
    {
        for(int m=0;m<c;m++)
        {
           printf("%d ",arr[i][m]);
        }
        printf("\n");
    }
    
}