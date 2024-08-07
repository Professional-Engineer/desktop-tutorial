#include <stdio.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>

void printSum(char *a);

int main(){
  char a[20];
  if(fgets(a, sizeof(a), stdin) != NULL){
    a[strcspn(a, "\n")] = 0;
    printSum(a);
  }
  else{
    printf("Error reading input.\n");
  }
  return 0;
}

void printSum(char *a){
  int l = strlen(a);
  int sum = 0;
  for(int i = 0; i < l; i++){
    if(isdigit(a[i])){
      sum += a[i] - '0';
    }
  }
printf("%d\n", sum);
}
