#include<stdio.h>
int main()
{
  int k;
  scanf("%d",&k);
  int j=k/100;
  int l=(k%100)%10;
  int m=j+l;
  printf("%d",m);
  //Type your code here
  return 0;
}