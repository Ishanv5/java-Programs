#include<stdio.h>
#include<stdlib.h>
struct Employees_info{
  char name[100];
  int code;
  float salary;
  char designation[100];
};
int main(){
    int n;
    printf("Enter Employees : ");
    scanf("%d",&n);
    struct Employees_info em[n];
    for(int i=0; i<n; i++){
        printf("Employees %d : ",i+1);
        printf("Employees NAME : ");
        scanf("%s",em[i].name);
        printf("Employees Code : ");
        scanf("%d",&em[i].code);
        printf("Employees salary : ");
        scanf("%f",&em[i].salary);
        printf("Employees designation : ");
        scanf("%s",&em[i].designation);
        char ch=getchar();
        printf("\n");
    }
    printf("------------------------------- All Employees Details ------------------------------- \n");
    for(int i=0; i<n; i++){
        printf("Employees NAME \t: ");
        printf("%s \n",em[i].name);

         printf("Employees Code \t: ");
        printf("%d \n",em[i].code);

         printf("Employees Salary \t: ");
        printf("%.2f \n",em[i].salary);

           printf("Employees Designation \t: ");
        printf("%s \n",em[i].designation);

        printf("\n");
        
                
        
    }
    return 0;
}