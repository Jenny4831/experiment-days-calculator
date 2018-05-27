# Experiment-days-calculator 

### Introduction ###

Calculates days between the start date and last date experiment. Allows the user to enter two dates in the following format:
DD/MM/YYYY - DD/MM/YYYY. The amount of days exclude the overlapsed days, which are the first day and the last day. 
The scientist have given the following test cases:
1. 02/06/1983 - 22/06/1983: 19 days
2. 04/07/1984 - 25/12/1984: 173 days
3. 03/01/1989 - 03/08/1983: 1979 days
Hence, it is assumed that the program will sort the dates, to indicate which one is start date and end date.
To complete this project I have used Eclipse neon3 and java version "1.8.0_101".
The test cases given are to test the methods of the main class.

### Prerequisites ### 
Java compiler or Eclipse

Eclipse can be downloaded in http://www.eclipse.org/downloads/

### Instruction ### 

If you are running on command line:
  1. Find the directory where the program is stored
  ```
  cd daysCalcutor/src
  ```
  2. Compile
  ```
  javac Calculator.java MyDate.java
  ```
  3. Run program and insert dates
  ```
  java Calculator DD/MM/YYYY - DD/MM/YYYY
  ```
  4.The results will be printed on screen

Example input:
  ```
  java Calculator 02/06/1983 - 22/06/1983
  ```
Example output:
  ```
  19 days
  ```
If you are using Eclipse:

  1. Select run configurations from run button
  2. Click Arguments and inser dates DD/MM/YYYY - DD/MM/YYYY under program arguments
  3. Click Run

You can also run the test cases in Eclipse, by simply running testDaysCalculator.java

### Author ###
Naimen, ZL

