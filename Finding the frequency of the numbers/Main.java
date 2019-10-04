#include <stdio.h>
#include <string.h>
int main()
{
  int n,b,c=0,k;
  scanf("%d",&n);
  scanf("%d",&k);
  int arr1[n];
  for(int i=0;i<n;i++)
  {
     scanf("%d",&arr1[i]);
  }
 
 
  for(b=1;b<=k;b++)
  { c=0;
    for(int i=0;i<n;i++)
    {
        if(b==arr1[i])
        {
          c++;
        }
    }
    printf("%d %d\n",b,c);
 
  }
  return 0;
}
