#include <stdio.h>
int main() {
  int a;
  int b=0;
  scanf("%d",&a);
  for(int i=1;i<=a;i++)
  {
    b=b+1;
    printf("%d",i);
    if(b==3)
    {

      printf(",");
      b=0;
    }
  }
	//Type your code
	return 0;
}