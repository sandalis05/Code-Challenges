A series of code challenges utlizing .txt files


## **Example1**
   In example1.txt, the first line of input contains a single integer, n, that indicated the number of lines of input to follow. Example1.java prints each of the n lines of input exactly as they appear in the input file.
    
## **Example2**
   In example2.txt, the first line of input contains a single integer, n, that indicated the number of words of input to follow. Example1.java prints each of the n words of input exactly as they appear in the input file.
    
## **Bravo**
   This program, given a string of text from bravo.txt, prints each of the interations of a left0scrolling message for one full cycle of a marquee (referring to the HTML <marquee> element) message. 
    
## **Delta**
   Given an unordered list of integer values from delta.txt, this program finds and prints the statistical median of the sample data. 
    
## **Foxtrot**
   This program reverses the order of words in a sentence. The first line of foxtrot.txt contains a single integer that indicates the number of lines of text to follow. The program will output each line of text with the words in reverse order.
    
## **Hotel**
   Given 2 integer operands in an arbitrarily specified base, the program will calculate their values and sum in decimal (base-10). The first line of hotel.txt contains a single interger that indicates the number of lines of text to follow. In each line, the first integer, in the range of 2 to 16 (inclusive), will indicate the base. The next two integers will contain the values for operands x and y. The program will output the sum of x and y in a base-10 expression "x + y = sum."
    
## **Juliett**
   This program reformats text such that vowels are printed in uppercase and non-vowels are printed in lowercase.
    
## **Lima**
   This program rotates an NxN matrix clockwise by 90 degrees. The first line of input in lima.txt contains a single integer n that indicates the number of matrices to follow. Each matrix consists of the dimesnion of the matrix, followed by the matrix itself. The first line contains an integer that represents the dimensions of a square matrix (d rows by d columns). The next d lines of input represent each row of the matrix, with each character being seperated by a space. The output prints the clockwise rotation of the input matrix.
    
## **Oscar**
   A 10 x 20 acre field is to be surveyed for mineral deposits. Small, medium, and large scanners can be used to measure the total number of deposits found within 1-, 9-, and 25-acre sections, respectively. If a survey extends beyond the outer boundaries of the field, only the region within the 10 x 20 acre field is included. The first 10 lines of input represent the number of mineral deposits in each acre of the overall field. Each line represents 1 row of the field and consists of 20 space-separated integers, i. Each survey consists of a single line of input representing the size and location of the survey: The size is represented by either the letter "S" (small = 1 acre), "M" (medium = 9 acres), or "L" (large = 25 acres). The row number, r, of the center of the survey area, where row numbers are 0-based. The column number, c, of the center of the survey area, where column numbers are 0-based. The program prints the total number of mineral deposits found within the area surveyed for each survey.
 
## **Quebec**
   Given a series of empty pallets, several labeled boxes are initially stacked up on the first pallet (e.g., Pallet #0). A forklift can then be used to move the boxes. The forklift can only move one box at a time and only from one pallet to the next adjacent pallet. A series of instructions are given indicating from which pallet the next box should be removed. When moved, each box will always move to the next higher-numbered pallet. The full list of instructions will ultimately move all boxes from the first pallet (e.g., Pallet #0) to the last pallet (e.g., Pallet #n-1). The first line of input will contain a single integer, n, that indicates the total number of pallets that are to be used. The second line of input will contain b space-separated strings representing the boxes in the initial state of Pallet #0. The first string shall represent the label for the box placed at the bottom of Pallet #0, the second string represents the label for the box on top of that, and so on until the last string is the label for the box at the top of Pallet #0. The third line of input will contain i space-separated integers representing sequence of instructions that are to be executed in order to move all of the boxes from Pallet #0 to Pallet #n-1. Each integer indicates the pallet number from which to move a box. The output will print the labels for the boxes making up the final state for Pallet #n-1. 
    
## **Uniform**
   This program mimics Polish notation, a method for writing arithmetic expressions such that proper order of operations in enforced without the need for explicit parentheses. This is equivalent to a pre-order traversal of an arithmetic expression tree. The first line of uniform.txt contains a single integer n that indicates the number of prefix expressions to follow. Each prefix expression consists of m integer operands and m-1 operators, limited to addition (+), subtraction (-), multiplication (*), and division (/). The program will print the evaluated value for each prefix expression.
