#include<stdio.h>
int main(){
  int n;
  int k=1;
    scanf("%d", &n);
	for(int cur_row =1; cur_row <= n; cur_row++) 
    
      {
      k=cur_row;
		 for(int cur_col=1; cur_col <= n ; cur_col++)  
           {
           		printf("%d",k);
            }
      printf("\n");
        }
	
		 return 0;
}