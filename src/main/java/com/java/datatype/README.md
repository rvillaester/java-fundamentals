# Primitive Data Types
Most basic data types available within the Java language. There are 8: boolean , byte , char , short , int , long , float and double.

###### byte
- 8-bit signed two's complement integer
- values ranging from -128 to 127
- default value is 0
- **Byte** is the wrapper class

###### short
- 16-bit signed two's complement integer
- values ranging from -32,768 to 32,767
- default value is 0
- **Short** is the wrapper class

###### int
- 32-bit signed two's complement integer
- values ranging from -2,147,483,648 to 2,147,483,647
- default value is 0
- **Integer** is the wrapper class

###### long
- 64-bit signed two's complement integer
- values ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- default value is 0L
- **Long** is the wrapper class

###### float
- single-precision 32-bit IEEE 754 floating point
- never used for precise values such as currency
- default value is 0.0f
- **Float** is the wrapper class

###### double
- double-precision 64-bit IEEE 754 floating point
- never used for precise values such as currency
- default value is 0.0d
- **Double** is the wrapper class

###### boolean
- represents one bit of information
- only two possible values: true and false
- Default value is false
- **Boolean** is the wrapper class

###### char
- single 16-bit Unicode character
- minimum value is '\u0000' (or 0)
- maximum value is '\uffff' (or 65,535 inclusive)
- used to store any character
- **Character** is the wrapper class

**Note: The wrapper class of all primitive data types will have the default value of null as it's an object**

## Type Casting
Is the process when you assign a value of one primitive data type to another type
###### Widening Casting
**Automatically** converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
###### Narrowing Casting
**Manually** converting a larger type to a smaller size type

# String
A string is a sequence of characters that exist as an object of the class java.lang.String. It is created and manipulated through the string class. Once created, a string is immutable -- its value cannot be changed.

# Collections
Is a framework that provides an architecture to store and manipulate the group of objects. It can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
###### Collection Interfaces
- Set
- List
- Queue

# Map