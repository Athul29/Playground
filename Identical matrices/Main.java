
#include <stdio.h>
int main()
{
int r,c ;
scanf("%d %d",&r ,&c);
int mat[r][c];
int mat1[r][c];
for(int i = 0; i < r; i++)
{
  for(int j = 0; j < c; j++)
  {
       scanf("%d",&mat[i][j]);
  }
}
for(int i = 0; i < r; i++)
{
  for(int j = 0; j < c; j++)
  {
       scanf("%d",&mat1[i][j]);
  }
}
int f=0;
for(int i = 0; i < r; i++)
{
  for(int j = 0; j < c; j++)
  {
       if(mat[i][j]!=mat1[i][j])
       {
         f=1;        
       }
   
    }
  }
if(f==0)
{
    printf("Yes");
}
else
{
printf("No");
}
return 0;
}