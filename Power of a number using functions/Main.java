#include <stdio.h>
void power(int base,int exp)
{
    int ans=1;
    for(int i=1;i<=exp;i++)
    {
        ans=ans*base;
    }
    printf("%d",ans);

}

int main()
{
 	int l,m;
  scanf("%d %d",&l,&m);
    power(l,m);
    return 0;
}