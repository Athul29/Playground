/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <string.h>
int main()
{
    int size,e;
    int largest=0;
    int count=1;
    int l=0;
    scanf("%d",&size);
    int arr[size];
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int j=0;j<size;j++)
    {
       for(int k=j;k<size;k++)
       {
           if(arr[j]==arr[k])
               count++;
       } 
   if(largest<count)
   {
       largest=count;
       e=arr[j];
     
   }
       count=0;
    }
    printf("%d ",e);
}
