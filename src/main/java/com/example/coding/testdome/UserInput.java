package com.example.coding.testdome;

/*
User interface contains two types of user input controls: TextInput, which
        accepts all characters and NumericInput, which accepts only digits.

        Implement the class TextInput that contains:

        * Public method void Add(char c) - adds the given character to the current value
        * Public method string GetValue() - returns the current value

        Implement the class NumericInput that:

        * Inherits TextInput
        * Overrides the Add method so that each non-numeric character is ignored

        For example, the following code should output "10":

        TextInput input = new NumericInput();
        input.Add('1');
        input.Add('a');
        input.Add('0');
        Console.WriteLine(input.GetValue());
        */


public class UserInput {


    public static class TextInput {

        protected StringBuilder stringBuilder;

        public TextInput() {
            this.stringBuilder = new StringBuilder();
        }

        public void Add(char c) {
            stringBuilder.append(c);
        }

        public String GetValue() {
            return stringBuilder.toString();
        }

    }

    public static class NumericInput extends TextInput {

        public NumericInput() {
            super();
        }

        @Override
        public void Add(char c) {
            if(Character.isDigit(c)) {
                super.Add(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.Add('1');
        input.Add('a');
        input.Add('0');
        System.out.println(input.GetValue());
    }


}
