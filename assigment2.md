# Java Assignments Notes

## Assignment 5

### Closed Interval and Open Interval

### Closed Interval

A **closed interval** includes both end points.

Example:

-   **\[2, 8\]**
-   Mathematical representation:

``` text
2 <= n <= 8
```

### Open Interval

An **open interval** does **not** include the end points.

Example:

-   **(2, 8)**
-   Mathematical representation:

``` text
2 < n < 8
```

### Half-Open Interval

Example:

-   **(2, 8\]**

Mathematical representation:

``` text
2 < n <= 8
```

### Practice

-   Perform all relational operators.
-   Find the minimum relational operator(s) required to mimic all other
    relational operators.
-   Evaluate expressions like:

``` java
(a-- <= b || b++ != c)
```

Determine whether the condition holds and trace the values after
execution.

### Aptitude

Study **Dr. R.S. Aggarwal Aptitude**:

-   Median
-   Advanced topics

------------------------------------------------------------------------

# Assignment 6

## Relational Operators

-   `==`
-   `!=`
-   `>=`
-   `<=`
-   `>`
-   `<`

### Goal

Learn how to mimic all relational operators using only one relational
operator (`>=`) together with logical operators.

  Operator to Mimic   Using Only `>=`
  ------------------- ---------------------------
  `a >= b`            `a >= b`
  `a > b`             `(a >= b) && !(b >= a)`
  `a < b`             `!(a >= b)`
  `a <= b`            `b >= a`
  `a == b`            `(a >= b) && (b >= a)`
  `a != b`            `!((a >= b) && (b >= a))`

### Key Conclusion

All relational operators can be mimicked using only `>=` (or only `<=`)
along with logical operators.

------------------------------------------------------------------------

# Assignment 7

## Difference Between Logical and Bitwise Operators

### Logical Operators (Short-Circuit)

Operators:

-   `&&`
-   `||`

Characteristics:

-   Use **short-circuit evaluation**.
-   If the first condition already determines the result, Java skips
    evaluating the second condition.
-   Generally faster because unnecessary evaluations are avoided.
-   Primarily used in decision-making (`if`, `while`, etc.).

### Bitwise Operators (Non-Short-Circuit)

Operators:

-   `&`
-   `|`

Characteristics:

-   Always evaluate both operands.
-   Comparatively slower in boolean expressions because no
    short-circuiting occurs.
-   Essential for **bit manipulation** and low-level programming.

### Summary

  -----------------------------------------------------------------------
  Logical Operators                   Bitwise Operators
  ----------------------------------- -----------------------------------
  Short-circuit evaluation            No short-circuit evaluation

  May skip the second condition       Always evaluates both conditions

  Generally faster for boolean        Comparatively slower for boolean
  expressions                         expressions

  Used in decision making             Used in bit manipulation and
                                      low-level operations
  -----------------------------------------------------------------------
