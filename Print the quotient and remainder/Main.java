#include<stdio.h>

int main()
{
  int n = 365, quoteint, remainder;
  quoteint = 365 / 4;
  remainder = 365 % 4;
  printf("Quotient: %d\nRemainder: %d", quoteint, remainder);
  return 0;
}