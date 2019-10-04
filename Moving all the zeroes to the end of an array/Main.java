#include<stdio.h>
int main()
{
int i,l;
int size;

scanf("%d ",&size);
int arr[size],brr[size];
for(i = 0; i < size; i++)
{ 
   scanf ("%d", &arr[i]);
} 
 int g=0,k=size;
for(int m=0;m<size;m++)
{
   if(arr[m]==0)
   {
     brr[k]=arr[m];
     k--;
   }
  else
  {
    brr[g]=arr[m];
    g++;
  }
}
 for( l=0;l<size;l++)
 {
   printf("%d ",brr[l]);
 }
}