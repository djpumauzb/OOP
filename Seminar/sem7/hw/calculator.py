from operators import AddOperation, MultiplyOperation, DivideOperation

class Calculator:
    def __init__(self):
        self.operations = {
            '+': AddOperation(),
            '*': MultiplyOperation(),
            '/': DivideOperation(),
        }
    
    def calculate(self, a, op, b):
        if op in self.operations:
            result = self.operations[op].execute(a, b)
            return f"Операция: {a} {op} {b} = {result}"
        else:
            return f"Операция: {a} {op} {b} = {result}"
