#include <stdio.h>
int main()
{
	int n;
  int i=0;
    scanf("%d",&n);
	for(int row_no = 1 ; row_no <= n ; row_no++)
     
      {
		for(int space = 1 ; space <= (n-row_no) ; space++ ) 
           {
			 printf(" ");
	       }
		for(int col_no = 1 ; col_no <= row_no ; col_no++)
        {
             i=i+1;
			 printf("%d ",i);
         
		   }
		printf("\n");			
	 }
      
     return 0;
}