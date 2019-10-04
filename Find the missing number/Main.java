#include <stdio.h>
int main()
{
    int f=0;
    int b=0;
    int n;
    scanf("%d",&n);
    int str[n];
    for(int i=0;i<n;i++)
    {
       scanf("%d",&str[i]);
       
    }
    for(int b=0;b<n-1;b++)
    {
        if(str[b]+1!=str[b+1])
        {
              printf("%d \n",str[b]+1);
        }
    }
    return 0;
    
}
