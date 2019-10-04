#include<stdio.h>
#include<string.h>
int main()
{
    int f=0;
    char arr[100];
    scanf("%[^\n]s",arr);
    int len=strlen(arr);
    int m;
    for(m=0;m<len;m++)
    {
        f=0;
         for(int n=0;n<len;n++)
         {
             if(arr[m]==arr[n] && m!=n)
             {
                 f=f+1;
                 break;
             }
             
        
         }
         if(f==0)
         {
             printf("%c",arr[m]);
            break;
         }
    }
    if(f==1)
    {
	printf("All the characters are repetitive");
    }
    return 0;
}
 