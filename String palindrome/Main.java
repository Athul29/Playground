#include <stdio.h>
#include <string.h>
int main()
{
    int f=0;
    char str[100];
    scanf("%s",str);
    int length=strlen(str);
    for(int i=0;i<length/2;i++)
    {
        if(str[i]==str[length-1])
        {
            f=1;
        }
        else
        {
            f=0;
            break;
        }
        length--;
    }
    if(f==1)
    {
        printf("%s is a palindrome",str);
    }
    else
    {
        printf("%s is not a palindrome",str);
    }
    return 0;
    
}
