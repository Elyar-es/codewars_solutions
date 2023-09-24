# Problem

Let us write down the infinite consecutive positive integers in a sequence in one line without any space. And then write their squares in the second line. This will generate two different long numbers, now we want to calculate the sum of these two numbers. 

Of course, the result of the calculation will be a infinite sequence too. The calculation of the first 30 digits is just as below:
```
  123456789101112131415161718192...
+ 149162536496481100121144169196...
= 272619325597593231536305887388...
```

As you can see, the first digit of the result is `2`, the second digit is `7`, and the third is `2` and so on. 

Can you find out the `n`<sub>th</sub> digit of this infinite sequence?



# Task

You are given an integer `n`, you should output the digit at position `n` in the resulting infinite sequence.

Note that `n` is 0-based. 

Still don't understand the problem? Look at the following examples:

# Examples

For `n = 1`, the output should be `7`.

```
272619325597593231536305887388...
 ^
 1st digit
```
For `n = 5`, the output should be `9`.

```
272619325597593231536305887388...
     ^
     5th digit
```
For `n = 29`, the output should be `8`.

```
272619325597593231536305887388...
                             ^
                             29th digit
```


# Note

- `0 <= n < 2^31`

- In order to avoid timeout, be aware of the code's performance ;-)

~~~if:javascript
- Something like `require("bignumber.js")` was disabled. 
~~~
~~~if:java
- Use of `BigInteger`, `BigDecimal`, and some other classes are restricted. These classes cannot occur in your solution file (even in comments or string literals).
~~~

- I'm not sure that my solution is absolutely right (perhaps failed in some edge cases?). If so, please give me some feedback. Thanks ;-)

- Happy Coding `^_^`
