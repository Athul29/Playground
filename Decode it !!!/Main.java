#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    scanf("%[^\n]s", str);
    int key;
    scanf("%d", &key);
    int str_len = strlen(str);
    for(int index = 0; index <= str_len - 1; index++)
    {
     	 char ch = str[index];
     	 if(ch >= 'A' && ch <= 'Z')
      	{
          
       	 	int offset = key% 26;
       ch=ch-offset;
      	}
     	 else if(ch >= 'a' && ch <= 'z')
      	{
       		int  offset = key% 26;
           ch=ch-offset;
           if(ch<=96&&ch>=90)
             ch=ch+26;
      	}
      str[index] = ch;
    }
    printf("%s", str);
}