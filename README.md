
# LeetCode Challenge D25
## Achievements
[![image.png](https://i.postimg.cc/dtvKVdTm/image.png)](https://postimg.cc/z3dQdy7V)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [1844.  Replace All Digits with Characters](https://leetcode.com/problems/replace-all-digits-with-characters/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

Given a  **0-indexed**  string  `s`  that has lowercase English letters in its  **even**  indices and digits in its  **odd**  indices, and a function  `shift(c, x)`, where  `c`  is a character and  `x`  is a digit, that returns the  `xth`  character after  `c`, for every  **odd** index  `i`, you want to replace the digit  `s[i]`  with  `shift(s[i-1], s[i])`. Return  `s` _after replacing all digits. It is  **guaranteed**  that_ `shift(s[i-1], s[i])` _will never exceed_ `'z'`.

**Example**
> **Input:** s = "a1c1e1"
> 
> **Output:** "abcdef"
> 
> **Explanation:** The digits are replaced as follows:
>- s[1] -> shift('a',1) = 'b'
>- s[3] -> shift('c',1) = 'd'
>- s[5] -> shift('e',1) = 'f'

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The algorithm iterates through the string's odd indices, representing digits, and replaces each digit with the character obtained by shifting the preceding character by the specified amount. The solution employs a character array for easy manipulation, and a for loop to traverse the string, updating the digits according to the defined shift logic. The shift function itself takes the current character and the digit as input, computes the shift based on the character's index in the alphabet, and returns the resulting character. The final modified character array is converted back to a string and returned as the output.
