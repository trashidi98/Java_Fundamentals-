# Week 2 File Break Down 

## Part 1 

In this file it's all about searching for the text that you want. And extracting that sub-string from the given 
string. The point of the assignment is to look for a valid DNA strand given that DNA starts with "ATG" and ends 
with "TAA". DNA is also split into groups of 3. A valid DNA sample may be **ATGGTATAA** because it has ATG, TAA and 
the word is divisble by 3. 

These are the factors I took into account as I looked for valid DNA samples in this file. 

## Part 2 

This file is modified with the same paramters as Part 1 but, now the user can indicate a lower case search. Such as 
**atg** or **taa**. 

## Part 3 

This file looks for a double occurence in a string. The word _by_ exists twice in the sentence _A Story by Abby 
Long_. It returns a boolean true if there is a double occurence and false otherwise. 

## Part 4 

In this file, the goal is to find the last part of the word. The function lastPart is fed two Strings, string a and 
string b. If string a exists in string b then the function returns the word or sentence after string a i.e. the 
rest of string b. Example: if string b is "Yellowknife, Canada" and string a is "knife", it would return ", 
Canada". 

## Part 5 

Probably the most interesting and useful code in this series. The code when supplied a webpage of links can 
extract and count the number of Yotube Links in that page. Upper or lower case is no issue for this piece of code. 

 
