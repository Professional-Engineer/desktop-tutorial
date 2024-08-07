 #include<stdio.h>

void enterNumbers(int n, int numbers[]);
void output(int k, int n, int numbers[]);

int main(){
  int n, k;
  scanf("%d %d", &n, &k);
  int numbers[n];
  enterNumbers(n, numbers);
  output(k, n, numbers);
  return 0;
}

void enterNumbers(int n, int numbers[]){
  for(int i=0; i < n; i++){
    numbers[i] = i + 1;
  }
}

void output(int k, int n, int numbers[]){
  int a;
  int b;
  int andlogic = 0; 
  int orlogic = 0;
  int xorlogic = 0;
  for(int i = 0; i < n - 1; i++){
    for(int j = i + 1; j < n; j++){
      if(i != j){
        a = numbers[i];
        b = numbers[j];
        if((a & b) > andlogic && (a & b) < k){
          andlogic = a & b;
        }
        if((a | b) > orlogic && (a | b) < k){
          orlogic = a | b;
        }
        if((a ^ b) > xorlogic && (a ^ b) < k){
          xorlogic = a ^ b;
        }
      }
    }
  }
  printf("%d\n", andlogic);
  printf("%d\n", orlogic);
  printf("%d\n", xorlogic);
}
