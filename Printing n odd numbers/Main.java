#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  for(int i=1,j=i;i<=n;j=j+2,i++)
  {
    printf("%d\n",j);
  }
	return 0;
}