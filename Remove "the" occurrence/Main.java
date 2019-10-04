#include<stdio.h>
#include<string.h>
int main()
{
    int f=0;
    char arr[100];
    scanf("%[^\n]s",arr);
    int stringLen=strlen(arr);
    
    int found=1;
    int i;
    int j;
    for(int b=0;b<=2;b++)
    {
    for(i=0;i<stringLen;i++)
    {
        if( (arr[i]=='t' && arr[i+1]=='h' && arr[i+2]=='e' && arr[i+3]==' ') ||(arr[i]=='T' && arr[i+1]=='h' && arr[i+2]=='e' && arr[i+3]==' ')  )
        {
            int b=i;
            for(int j=i;j<=b;j++)
            {
                arr[j]=' ';
            }
            found=0;
            break;
        }
    }
    if(found == 0)
        {
            for(j=i; j<=stringLen - 4; j++)
            {
                arr[j] = arr[j + 4];
            }

            stringLen = stringLen - 4;
            i--;
        }
}
    printf("%s", arr);
    return 0;
}
 