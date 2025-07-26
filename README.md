# Multi Unit Convertor
[![Ask DeepWiki](https://devin.ai/assets/askdeepwiki.png)](https://deepwiki.com/x-neon-nexus-o/Multi_Unit_Convertor.git)

Multi Unit Convertor is a versatile Android application designed for quick and easy conversions across various measurement categories. The app provides a simple, user-friendly interface to handle common conversion needs, from digital data storage to physical measurements.

## Features

This application supports conversions for the following categories:

-   **Data:** Bytes (B), Kilobytes (KB), Megabytes (MB), Gigabytes (GB), and Terabytes (TB).
-   **Length:** Millimeters (MM), Centimeters (CM), Meters (M), and Kilometers (KM).
-   **Mass:** Milligrams (mg), Grams (g), Kilograms (kg), and Tonnes (t).
-   **Numerical Systems:** Decimal, Binary, Octal, and Hexadecimal.
-   **Temperature:** Celsius (°C), Fahrenheit (°F), and Kelvin (K).
-   **Time:** Microseconds (μs), Milliseconds (ms), Seconds (s), Minutes (min), and Hours (h).

## How to Use

1.  Launch the application to see the main menu.
2.  Select a conversion category (e.g., Length, Temperature, Data).
3.  On the converter screen, enter the numeric value you wish to convert in the input field.
4.  Select the radio button corresponding to the unit of the value you entered.
5.  The application will instantly calculate and display the converted values in all other available units for that category.

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

-   Android Studio
-   Git

### Installation

1.  Clone the repository:
    ```sh
    git clone https://github.com/x-neon-nexus-o/Multi_Unit_Convertor.git
    ```
2.  Open the project directory in Android Studio.
3.  Wait for Gradle to build and sync the project dependencies.
4.  Run the application on an Android emulator or a physical device.

## Project Structure

The application is structured with a main menu activity and separate activities for each conversion category.

-   `MainActivity.java`: The main entry point of the app, displaying a menu of all available converter options.
-   `MainActivity2.java`: Handles all **Data** unit conversions.
-   `MainActivity3.java`: Handles all **Length** unit conversions.
-   `MainActivity4.java`: Handles all **Mass** unit conversions.
-   `MainActivity5.java`: Handles all **Numerical System** conversions.
-   `MainActivity6.java`: Handles all **Temperature** unit conversions.
-   `MainActivity7.java`: Handles all **Time** unit conversions.
-   `/app/src/main/res/layout/`: This directory contains the XML layout files (`activity_main.xml`, `activity_main2.xml`, etc.) that define the user interface for each screen.
