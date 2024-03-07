from calculator import Calculator

if __name__ == "__main__":
    calc = Calculator()
    print(calc.calculate(10, '+', 5))
    print(calc.calculate(10, '*', 5))
    print(calc.calculate(10, '/', 5))
    print(calc.calculate(10, '/', 0))  # Пример логирования ошибки
