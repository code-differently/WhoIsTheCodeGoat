# 01 Sieve of Eratosthenes

Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.

#### Sample 01

```
Input: n = 10
Output: 2 3 5 7
```

```
Input: n = 20
Output: 2 3 5 7 11 13 17 19
```

# 02 Magic Square

A magic square of order n is an arrangement of n^2 numbers, usually distinct integers, in a square, such that the n numbers in all rows, all columns, and both diagonals sum to the same constant. A magic square contains the integers from 1 to n^2.

The constant sum in every row, column and diagonal is called the magic constant or magic sum, M. The magic constant of a normal magic square depends only on n and has the following value:
M = n(n^2+1)/2

```
Magic Square of size 3
-----------------------
  2   7   6
  9   5   1
  4   3   8
Sum in each row & each column = 3*(3^2+1)/2 = 15
```

```
Magic Square of size 5
----------------------
  9   3  22  16  15
  2  21  20  14   8
 25  19  13   7   1
 18  12   6   5  24
 11  10   4  23  17
Sum in each row & each column = 5*(5^2+1)/2 = 65
```

```
Magic Square of size 7
----------------------
 20  12   4  45  37  29  28
 11   3  44  36  35  27  19
  2  43  42  34  26  18  10
 49  41  33  25  17   9   1
 40  32  24  16   8   7  48
 31  23  15  14   6  47  39
 22  21  13   5  46  38  30
Sum in each row & each column = 7*(7^2+1)/2 = 175
```

# 03 Count of substrings
Given a string str of lowercase alphabets and an integer K, the task is to count all substrings of length K which have exactly K distinct characters.

```
Input: str = “abcc”, K = 2
Output: 2

```

### Explanation:
Possible substrings of length K = 2 are
ab : 2 distinct characters
bc : 2 distinct characters
cc : 1 distinct character

Only two valid substrings exist {“ab”, “bc”}.


```
Input: str = “aabab”, K = 3
Output: 0
```

### Explanation:
Possible substrings of length K = 3 are
aab : 2 distinct characters
aba : 2 distinct characters
bab : 2 distinct characters

No substrings of length 3 exists with 
exactly 3 distinct characters

# 04 Product Array Puzzle
Given an array A of size N, construct a Product Array P (of same size) such that P is equal to the product of all the elements of A except A[i].

```
Input: int[] input = {10, 3, 5, 6, 2}
Output: {180, 600, 360, 300, 900}
```

```
Input: int[] input = {12 20}
Output: {20,12}
```


# 05 FOR The CROWN CHALLENGE
## Bigger is Greater

Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than another string if it comes later in a lexicographically sorted list.

Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:

* It must be greater than the original word
* It must be the smallest word that meets the first condition

For example, given the word w = abcd, the next largerest word is abdc

Create a function called biggerIsGreater and return the new string meeting the criteria. If it is not possible, return

```
Input : {"ab","bb","hefg","dhck","dkhc"}
Output : {"ba", "no answer" ,"hegf", "dhkc", "hcdk"}

```

#### Test case 1:
ba is the only string which can be made by rearranging ab. It is greater.
#### Test case 2:
It is not possible to rearrange bb and get a greater string.
#### Test case 3:
hegf is the next string greater than hefg.
#### Test case 4:
dhkc is the next string greater than dhck.
#### Test case 5:
hcdk is the next string greater than dkhc.


```
Input : {
"lmno",
"dcba",
"dcbb",
"abdc",
"abcd",
"fedcbabcd"}
Output : {
"lmon",
"no answer",
"no answer",
"acbd",
"abdc",
"fedcbabdc"}

```