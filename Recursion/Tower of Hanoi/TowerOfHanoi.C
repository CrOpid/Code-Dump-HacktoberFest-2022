#include <stdio.h>
#include <conio.h>
void ToH(int, char, char, char);
void main()
{
   int n;
   printf("Enter the number of disk : ");
   scanf("%d", &n);
   printf("Here is sequence of moves of tower of hanoi  :\n");
   ToH(n, 'A', 'C', 'B');
}
void ToH(int number, char source, char destination, char spare)
{
   if (number == 1)
      {
         printf("\n move disk 1 from source %c to destination %c", source, destination);

       return;
      }

     ToH(number - 1, source, spare, destination);

     printf("\n move disk %d from source %c to destination %c", number, source, destination);

     ToH(number - 1, spare, destination, source);

}
