from operators import AddOperation, MultiplyOperation, DivideOperation
import logging

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
            logging.info(f"Операция: {a} {op} {b} = {result}")
            return result
        else:
            logging.error(f"Операция {op} не поддерживается.")
            return None
