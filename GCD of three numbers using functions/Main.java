/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
void gcd(int num,int num1,int num2)
{
    int beep;
    int ans;
    int great;
    if(num>num1)
    {
        great=num;
        for(int i=1;i<=great;i++)
        {
            if(num%i==0)
            {
                if(num1%i==0)
                {
                    ans=i;
                }
            }
        }

    }
    else
    {
        
        great=num1;
        for(int i=1;i<=great;i++)
        {
            if(num1%i==0)
            {   
               if(num%i==0)
                    {
                        ans=i;
                    }
            }
        } 
        
    }
        
        
    int addon=ans;
    if(addon>num2)
    {
        great=addon;
        for(int i=0;i<great;i++)
        {
            if(addon%i==0)
            {
                if(num2%i==0)
                {
                    beep=i;
                }
            }
        }
        printf("%d",beep);
    }
    else
        {
            for(int i=1;i<=great;i++)
            {
                if(num2 %i==0)
                {
                    if(addon %i==0)
                    {
                        beep=i;
                     }
                }
            }
            printf("%d",beep);
        } 
}
int main()
{
 	int l,m,n;
  scanf("%d %d %d",&l ,&m,&n);
    gcd(l,m,n);
    return 0;
}
