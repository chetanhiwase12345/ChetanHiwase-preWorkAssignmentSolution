import java.util.Scanner;
public class Main {
Scanner sc = new Scanner(System.in);

//function to checkPalindrome
public void checkPalindrome()  {
int r,sum=0,temp;
System.out.println("Enter the input to check whether the number is palindrome or not a palindrome");
int input = sc.nextInt();
temp=input;    
while(input>0){    
r=input%10;  //getting remainder  
sum=(sum*10)+r;    
input =input/10;    
}    
if(temp==sum)    
   System.out.println("palindrome number ");    
else    
   System.out.println("not palindrome");    
      }

//function to printPattern
public void printPattern() {
System.out.println("Enter the input to print pattern");
int input = sc.nextInt();    
//inner loop  
for (int i= input-1; i>=0 ; i--)  
{  
//outer loop  
for (int j=0; j<=i; j++)  
{  
//prints star and space  
System.out.print("*" + " ");  
}  
//throws the cursor in the next line after printing each line  
System.out.println();  
}  
}

//function to check no is prime or not
public void checkPrimeNumber() {
System.out.println("Enter the input to check whether number is prime or not a prime number");
int input = sc.nextInt();  
boolean n = false;
   for (int i = 2; i <= input/ 2; ++i) {
      // condition for nonprime number
      if (input % i == 0) {
        n = true;
        break;
   }
}

    if (!n)
      System.out.println(input + " is a prime number.");
    else
      System.out.println(input + " is not a prime number.");
}
          
// function to print Fibonacci Series
public void printFibonacciSeries() {
//initialize the first and second value as 0,1 respectively.
int first = 0, second = 1;
System.out.println("Enter the input to print Fibonacci series");
int input = sc.nextInt(); 
    System.out.println("Fibonacci Series till " + input  + " terms:");
    for (int i = 1; i <= input ; ++i) {
      System.out.print(first + ", ");
      // compute the next term
      int next = first + second;
      first = second;
      second = next;
    }
 }

//main method which contains switch and do while loop
      public static void main(String[] args) {
                Main obj = new Main();
                int choice;
                Scanner sc = new Scanner(System.in);
do {
System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
System.out.println();
choice = sc.nextInt();
switch (choice) {
case 0:
choice = 0;
break;
case 1: {
obj.checkPalindrome();
}
break;
case 2: {
obj.printPattern();
}
break;
case 3: {
obj.checkPrimeNumber();
}
break;
case 4: {
obj.printFibonacciSeries();
}
break;
default:
System.out.println("Invalid choice. Enter a valid no.\n");
}} 
while (choice != 0);
System.out.println("Exited Successfully!!!");
sc.close();
}}