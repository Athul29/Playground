#include <stdio.h>
int main() {
  int n,k;
  scanf("%d",&n);
  while(n>10)
  {
    k=n%10;
    n=n/10;
  
  }
  printf("%d",k);
  
	//Type your code
	return 0;
}