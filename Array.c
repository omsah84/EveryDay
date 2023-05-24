#include<stdio.h>
#include<conio.h>
void main(){
    int i, n;
    printf("Enter the numebr: ");
    scanf("%d", &n);

    printf("The even number: ");
    for (i = 25; i <= n;i++){
        if(i%2 ==0){
            printf("%d ", i);
        }
    }

    return;
}