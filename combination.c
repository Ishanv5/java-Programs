#include<stdio.h>
int fact(int);
int main(){
    int n,r,ncr;
    printf("Enter the value of n and r :");
    scanf("%d %d",&n,&r);
    ncr=fact(n)/(fact(r)*fact(n-r));
    printf("Value of %dC%d : %d \n",n,r,ncr);
    return 0;
}
int fact(int n){
    int i=1,f=1;
    for(i=1;i<=n;i++){
        f=f*i;
    }
    return f;
}