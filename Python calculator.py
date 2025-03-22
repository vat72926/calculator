class Calculator:
    def add(self, a: int, b: int) -> int:
        return a + b

    def subtract(self, a: int, b: int) -> int:
        return a - b

    def multiply(self, a: int, b: int) -> int:
        return a * b

    def divide(self, a: int, b: int) -> float:
        if b == 0:
            raise ValueError("Division by zero is not allowed")
        return a / b

if __name__ == "__main__":
    calculator = Calculator()
    print(f"Sum: {calculator.add(5, 10)}")
    print(f"Difference: {calculator.subtract(15, 7)}")
    print(f"Product: {calculator.multiply(4, 6)}")
    print(f"Quotient: {calculator.divide(20, 5)}")
