#include <stdio.h>
int main() {
  int a,b,c;
  scanf("%d",&a);
  c=a%10;
  while(a>9)
  {
    b=a%10;
    a=a/10;
    
  }
  int p=a+c;
  printf("%d",p);
	//Type your code
	return 0;
}