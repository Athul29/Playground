#include<stdio.h>
int summ(int s)
{
 int l=0;

  for(int i=1;i<=s;i++)
  {
    l=l+i;

  }
  return l;
}
int main() {
  int s;
    scanf("%d",&s);
  int b=summ(s);
  printf("%d",b );

}