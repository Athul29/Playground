#include <stdio.h>
long int sum(int n);
int main()
{
    int n;
    scanf("%d", &n);
    printf("%d",sum(n));
    return 0;
}
long int sum(int n)
{
    if (n >1)
        return n+sum(n-1);
    else
        return 1;
}