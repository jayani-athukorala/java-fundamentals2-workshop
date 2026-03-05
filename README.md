# Java Converter Application

This project contains a **Java console-based Converter Application** that allows users to perform different types of **unit conversions and calculations**.

The program provides a **menu-driven interface** where users can choose a converter, enter values, and receive results instantly.

---

## 📂 Project Structure
```
src/main/java/se.lexicon/
├─ Utility.java
├─ ConverterFormulas.java # Include all the mathematical formulas
├─ Converter.java
└─ Main.java
```

---

## 🛠 How to Run

1. Clone the repository:

```bash
git clone https://github.com/jayani-athukorala/java-fundamentals2-workshop.git
```
2. Open the project in your preferred IDE.

3. Build and run Main.java

```bash
javac -d out src/main/java/se/lexicon/*.java
java -cp out se.lexicon.Main
```

The converter menu will appear in the console where you can select different conversion options.

---

## 📌 Converter Features

### Unit Conversions
- Currency Converter (SEK ↔ USD, SEK ↔ EUR)
- Temperature Converter (Celsius ↔ Fahrenheit)
- Length Converter (Kilometers ↔ Meters)
- Weight Converter (Kilograms ↔ Grams)
- Time Converter (Hours ↔ Minutes)
- Speed Converter (km/h ↔ m/s)
- Fuel Consumption Converter (L/100km ↔ km/L)
- Data Storage Converter (KB ↔ MB ↔ GB)

### Calculators
- BMI Calculator (Body Mass Index)
- Grade Converter (Percentage → Letter Grade)

---

## ⚡ Example output:
```
============= Converter App Menu ==============
1. Currency (SEK ↔ USD, SEK ↔ EUR) Converter
2. Temperature (Celsius ↔ Fahrenheit) Converter
3. Length (Meters ↔ Kilometers) Converter
4. Weight (Kilograms ↔ Grams) Converter
5. Time (Hours ↔ Minutes) Converter
6. Speed (km/h ↔ m/s) Converter
7. Fuel Consumption (L/100km ↔ km/L) Converter
8. Data Storage (KB ↔ MB ↔ GB) Converter
9. BMI Converter
10. Grade (Percentage → Letter grade) Converter
11. Exit
================================================
Choose Option (1-11): 6
1. KM/H -> M/S
2. M/S -> KM/H
Select Option (1-2) : 1
Enter Speed in KM/H : 1000
Result : 1000.00 KM/H = 277.78 M/S
Converted at: 2026-03-05 19:22
================================================
What do you want to do next?
1. Try Again
2. Return to Main Menu
3. Exit
Select Option (1-3): 
```