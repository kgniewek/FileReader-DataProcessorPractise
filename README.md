# 2021 Java Practice Project - Simple File Reader and Data Processor

### Overview

This small Java project serves as a practice exercise to explore basic file operations, exception handling, and data manipulation in Java. The application reads from a simple text file containing details of individuals, processes the information, and performs basic filtering based on criteria.

### Functionality

- **Reading Data**: The application reads data from `people.txt` using `FileHelper`, which stores each line as a string in a list.
- **Data Conversion**: `PersonOperationHelper` converts these string entries into `Person` objects, using a custom format specified in the text file.
- **Error Handling**: Implements custom exception handling for data conversion errors, particularly focusing on salary values.
- **Data Filtering**: The `Main` class includes a method to filter `Person` objects based on surname start, sex, and a limit to the number of results.

### Usage

To run this application, compile and execute the `Main.java`. It requires no command line arguments but will automatically process data as per the hardcoded logic in the `main` method.

### Project Structure

- **src/com/company/Main.java**: Contains the `main` method that orchestrates the reading of data from a file, processing it into `Person` objects, and filtering based on specific attributes.
- **src/First/FileHelper.java**: Handles reading lines from a file and storing them in a list.
- **src/First/InvalidSalaryException.java**: Custom exception class for handling invalid salary data.
- **src/First/Person.java**: Data model class representing an individual with attributes like name, surname, age, city, salary, and sex.
- **src/First/PersonOperationHelper.java**: Provides functionality to convert lines of text into `Person` objects.
- **src/First/people.txt**: Text file containing semi-colon separated values representing people.

- 📁 **src**
  - 📁 **com**
    - 📁 **company**
      - `Main.java`
  - 📁 **First**
    - `FileHelper.java`
    - `InvalidSalaryException.java`
    - `people.txt`
    - `Person.java`
    - `PersonOperationHelper.java`
