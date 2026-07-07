# Assignment 8

## What is Pythonic?

**Pythonic** means writing Python code in a simple, readable, and
efficient way by following Python's philosophy and coding conventions.

> Pythonic = Simple + Readable + Efficient

## What is the Zen of Python?

The **Zen of Python** is a collection of guiding principles for writing
clean and efficient Python code.

``` python
import this
```

One famous principle:

> **Explicit is better than implicit.**

## What is PEP?

**PEP** stands for **Python Enhancement Proposal**.

### PEP 8

-   Official Python Style Guide
-   Explains how to write clean and readable Python code.

### PEP 20

-   Contains the **Zen of Python**.

------------------------------------------------------------------------

# Assignment 9

## Evolution of Programming Languages

``` text
1GL → Machine Language

↓

2GL → Assembly Language

↓

3GL → C, Java, Python

↓

4GL → SQL, MATLAB

↓

5GL → Prolog (Programming in Logic), Mercury
```

### Prolog

-   Programming in Logic
-   Used in Artificial Intelligence
-   Based on facts and rules

### Mercury

-   Logic programming language
-   Strongly typed
-   Faster and safer than Prolog

------------------------------------------------------------------------

# Assignment 10

## Why doesn't Python support Function Overloading?

Python binds one function object to a function name.

If another function with the same name is defined, the previous one is
replaced.

Python uses: - Default arguments - \*args - \*\*kwargs

instead of function overloading.

## Why is there limited Implicit Type Casting?

Python follows the Zen of Python principle:

> **Explicit is better than implicit.**

Python avoids automatic conversions that may introduce bugs.

Example:

``` python
int("10") + 20
```

------------------------------------------------------------------------

# Quick Revision

-   Pythonic → Clean, readable, efficient Python code.
-   Zen of Python → Philosophy of Python.
-   PEP → Python Enhancement Proposal.
-   PEP 8 → Coding Style Guide.
-   PEP 20 → Zen of Python.
-   1GL → Machine Language.
-   2GL → Assembly Language.
-   3GL → C, Java, Python.
-   4GL → SQL, MATLAB.
-   5GL → Prolog, Mercury.
-   No Function Overloading → Latest function replaces previous one.
-   Explicit is better than implicit.
