
#include <stdio.h>
int main()
{
int r,c;
  
scanf("%d %d",&r ,&c);
int mat[r][c];
for(int i = 0; i < r; i++)
{
  for(int j = 0; j < c; j++)
  {
       scanf("%d",&mat[i][j]);
  }
}
for (int i = 0; i < r; i++)
{
  for (int j =0, k=i; k < c;j++,k++)
  {       
     printf("%d ",mat[j][k]);
     
  }
}
return 0;
}