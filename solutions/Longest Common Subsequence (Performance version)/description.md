## Longest Common Subsequence (Performance version)

from [Wikipedia](http://en.wikipedia.org/wiki/Longest_common_subsequence_problem):  
The longest common subsequence (LCS) problem is the problem of finding the longest subsequence common to all sequences in a set of sequences.  
It differs from problems of finding common substrings: unlike substrings, subsequences are not required to occupy consecutive positions within the original sequences.

## Task

Write a function `lcs` that accepts two `string`s and returns their longest common subsequence as a `string`. 
Performance matters.

#### Examples

```javascript
lcs( "abcdef", "abc" ) => "abc"
lcs( "abcdef", "acf" ) => "acf"
lcs( "132535365", "123456789" ) => "12356"
lcs( "abcdefghijklmnopq", "apcdefghijklmnobq" ) => "acdefghijklmnoq"
```
```haskell
lcs "abcdef" "abc" -> "abc"
lcs "abcdef" "acf" -> "acf"
lcs "132535365" "123456789" -> "12356"
lcs "abcdefghijklmnopq" "apcdefghijklmnobq" -> "acdefghijklmnoq"
```
```clojure
(lcs "abcdef" "abc") ; "abc"
(lcs "abcdef" "acf") ; "acf"
(lcs "132535365" "123456789") ; "12356"
(lcs "abcdefghijklmnopq" "apcdefghijklmnobq") ; "acdefghijklmnoq"
```

#### Testing

This is a performance version of [xDranik](http://www.codewars.com/users/xDranik)'s [kata of the same name](http://www.codewars.com/kata/longest-common-subsequence/).  
This kata, however, has much more full and heavy testing. Intermediate random tests have string arguments of 20 characters; hard random tests 40 characters; extreme 60 characters (characters are chosen out of 36 different ones).
```if:javascript
The reference algorithm solves all (12 fixed, 72 intermediate, 24 hard, 12 extreme) tests within ~150ms. The example algorithm without memoisation would take ~15000ms.
```
```if:haskell
The naive (Wikipedia) solution will run out of time, but
the reference algorithm, stolen from the other kata from user geekyfox, showcasing memoisation, and
the example algorithm, optimising the recursion, do not have any runtime problems (at all).
```

#### Notes

The subsequences of `"abc"` are `"", "a", "b", "c", "ab", "ac", "bc", "abc"`.  
`""` is a valid subsequence in this kata, and a possible return value.  
All inputs will be valid.  
Two strings may have more than one longest common subsequence. When this occurs, return any of them.
```javascript
lcs( string0, string1 ) === lcs( string1, string0 )
```
```haskell
lcs xs ys == lcs ys xs
```
```clojure
(= (lcs xs ys) (lcs ys xs))
```
Wikipedia has an [article](http://en.wikipedia.org/wiki/Longest_common_subsequence_problem) that may be helpful.
