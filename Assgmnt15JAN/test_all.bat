@echo off
REM Test script for all assignment programs (Windows)

echo ==========================================
echo Testing All Assignment Programs
echo ==========================================
echo.

echo 1. Testing SumOfIntegers...
java SumOfIntegers 10 20 30 40 50
echo.

echo 2. Testing Factorial...
java Factorial 6
echo.

echo 3. Testing SingleDimensionalArray...
java SingleDimensionalArray 5 10 15 20 25
echo.

echo 4. Testing TwoDimensionalArray...
java TwoDimensionalArray predefined
echo.

echo 5. Testing DecimalToBinary...
java DecimalToBinary 42
echo.

echo 6. Testing PrimeChecker...
java PrimeChecker 17
echo.

echo 7. Testing ShiftOperators...
java ShiftOperators 8 2
echo.

echo ==========================================
echo All tests completed!
echo ==========================================
pause
