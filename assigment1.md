# Day 2 Notes

**Date:** 03/07/2026

# Assignment 1 -- Little Endian and Big Endian

When an integer occupies multiple bytes, **endianness** determines how
those bytes are mapped to memory addresses.

> **Note:** Endianness deals with the **order of bytes**, not the order
> of bits inside a byte.

## Little Endian

-   Least Significant Byte (LSB) is stored at the lowest memory address.

## Big Endian

-   Most Significant Byte (MSB) is stored at the lowest memory address.

## 2-Byte Example

    Binary:
    00010010 00110100

    Bytes:
    00010010 | 00110100

    MSB = 00010010
    LSB = 00110100

### Big Endian

    1000 -> 00010010
    1001 -> 00110100

### Little Endian

    1000 -> 00110100
    1001 -> 00010010

## 4-Byte Example

    Binary:
    00010010 00110100 01010110 01111000

    Bytes:
    00010010 | 00110100 | 01010110 | 01111000

### Big Endian

    1000 -> 00010010
    1001 -> 00110100
    1002 -> 01010110
    1003 -> 01111000

### Little Endian

    1000 -> 01111000
    1001 -> 01010110
    1002 -> 00110100
    1003 -> 00010010

# Assignment 2 -- C Program to Check Endianness

``` c
#include <stdio.h>

int main() {

    int x = 1;

    char *ptr = (char *)&x;

    if (*ptr == 1)
        printf("Little Endian");
    else
        printf("Big Endian");

    return 0;
}
```

Explanation: - int x = 1 stores the value 1. - &x gets the address of
x. - char \*ptr points to the first byte. - If the first byte is 1, it
is Little Endian. - Otherwise, it is Big Endian.

# Assignment 3 -- Bit, Byte and Word Size

## Bit

-   Smallest unit of data.
-   Can be 0 or 1.

## Byte

-   8 bits = 1 byte.

## Word

-   Amount of data the CPU processes in one operation.

Examples: - 32-bit processor = 32-bit word = 4 bytes - 64-bit processor
= 64-bit word = 8 bytes

## Registers

Registers are very fast storage locations inside the CPU.

## Address Space

32-bit:

    2^32 addresses

64-bit:

    2^64 addresses

A 64-bit operating system can efficiently execute 64-bit applications
and utilize a much larger address space than a 32-bit operating system.
