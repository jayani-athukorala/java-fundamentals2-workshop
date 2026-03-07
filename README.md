# Java Converter Application

A **console-based Java application** for performing various **unit conversions and calculations** such as currency, length, weight, speed, BMI, and grades. It provides a **menu-driven interface** for quick, interactive conversions.

---

## 📂 Project Structure
```
src/main/java/se/lexicon/
├─ Main.java                 # Entry point
├─ Converter.java            # Conversion logic
├─ ConverterTool.java        # Converter categories
├─ ConversionOption.java     # Individual conversion options
├─ ConverterFormulas.java    # All mathematical formulas
├─ ConversionResult.java     # Holds result of a conversion
└─ Utility.java              # User input helpers and validation
```

---

## 🛠 How to Run

1. Clone the repository:

    ```bash
    git clone https://github.com/jayani-athukorala/java-fundamentals2-workshop.git
    ```
   
2. Open the project in your preferred IDE.

3. Build and run Main.java

- If you are using command line: Compile and run application using commands below.
    ```bash
        javac -d out src/main/java/se/lexicon/*.java
        java -cp out se.lexicon.Main
    ```

The converter menu will appear in the console where you can select different conversion options.

---

## 📌 Converter Features

### Unit Conversions
    | Converter Type | Units Supported |
    |----------------|----------------|
    | Currency       | SEK ↔ USD, SEK ↔ EUR |
    | Temperature    | Celsius ↔ Fahrenheit |
    | Length         | Kilometers ↔ Meters |
    | Weight         | Kilograms ↔ Grams |
    | Time           | Hours ↔ Minutes |
    | Speed          | km/h ↔ m/s |
    | Fuel Consumption | L/100km ↔ km/L |
    | Data Storage   | KB ↔ MB ↔ GB |

### Calculators
- BMI Calculator – computes Body Mass Index and BMI category
- Grade Converter – converts percentage marks to letter grades (A–F)

---

## ⚡ Example output:
```
============= Converter App Menu ==============
1. Currency Converter – SEK ↔ USD, SEK ↔ EUR
2. Temperature Converter – Celsius ↔ Fahrenheit
3. Length Converter – Meters ↔ Kilometers
4. Weight Converter – Kilograms ↔ Grams
5. Time Converter – Hours ↔ Minutes
6. Speed Converter – km/h ↔ m/s
7. Fuel Consumption Converter – L/100km ↔ km/L
8. Data Storage Converter – KB ↔ MB ↔ GB
9. BMI Calculator – Compute BMI and category
10. Grade Converter – Percentage → Letter grade
11. Exit
================================================
Choose Option (1-11): 4
1. KG -> G
2. G -> KG
================================================
Choose Option (1-2) : 1
Enter Value in KG : 23.5
------------------------------------------------
Weight Converter – Kilograms ↔ Grams
------------------------------------------------
Result: 1 23.50 KG = 23500.00 G
Converted at: 2026-03-07 16:30
================================================
Press ENTER to continue...
What do you want to do next?
1. Repeat KG -> G Conversion
2. Return to Weight Converter – Kilograms ↔ Grams
3. Return to Main Menu
4. Exit
================================================
Choose Option (1-4): 1
Enter Value in KG : 4.5
------------------------------------------------
Weight Converter – Kilograms ↔ Grams
------------------------------------------------
Result: 0 4.50 KG = 4500.00 G
Converted at: 2026-03-07 16:31
================================================
Press ENTER to continue...
```