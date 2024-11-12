# Java File Handling Guide

This document provides an overview of key classes used for file handling in Java, including examples and use cases.

## 1. FileInputStream & FileOutputStream

**Purpose**:
- No Additional use of functions or classes so its easy
- `FileInputStream` and `FileOutputStream` are used to read and write raw bytes to and from files. They are suitable for handling binary data, such as images, audio files, and other non-text files.


## 2. FileReader & FileWriter

**Purpose**
- No Additional use of functions or classes so its easy
- `FileReader` and `FileWriter` are designed for reading and writing text files, handling character data rather than bytes. They use character encoding and are best suited for working with plain text files. They automatically handle character encoding, making them more appropriate than `FileInputStream` and `FileOutputStream` for text files.


## 3. DataInputStream & DataOutputStream

**Purpose**
- Here we use it with a combination of `FileOutputStream` and `FileInputStream`
- `DataInputStream` and `DataOutputStream` allow reading and writing primitive data types (int, double, boolean, etc.) in a binary format. These streams are useful for storing structured data that includes numbers and other primitive types and is meant to be read by a Java program.


## 4. BufferedInputStream & BufferedOutputStream

**Purpose**
- Same this class we use with a combination of  `FileOutputStream` and `FileInputStream`
- BufferedInputStream and BufferedOutputStream add buffering to InputStream and OutputStream. Buffering improves performance by reducing the number of I/O operations. Data is read or written in chunks, reducing the time spent on each individual operation.

## 5. PrintStream

**Purpose**
- Same this class we use with a combination of  `FileOutputStream` and `FileInputStream`
- For formatted text output, similar to System.out. Useful for printing formatted data to files.

## 6. PrintWriter

**Purpose**
-Prints formatted text to files, automatically handling character encoding and offering print() and println() methods. Useful for text-based output with formatted data.






