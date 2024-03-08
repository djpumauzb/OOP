class Operator:
    def execute(self, a, b):
        pass

class AddOperation(Operator):
    def execute(self, a, b):
        return a + b

class MultiplyOperation(Operator):
    def execute(self, a, b):
        return a * b

class DivideOperation(Operator):
    def execute(self, a, b):
        if b == 0:
            return "Деление на ноль!"
        return a / b
