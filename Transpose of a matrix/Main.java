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
    for(int j =0;j<r;j++)
    {
        for(int n=0;n<c;n++)
        {
            arr1[n][j]=arr[j][n];
           
        }
    }
    for(int j =0;j<c;j++)
    {
        for(int n=0;n<r;n++)
        {
            printf("%d ",arr1[j][n]);
           
        }
        printf("\n");
    }
}