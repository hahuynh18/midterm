/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmetic;

/**
 *
 * @author Ha Huynh
 */
enum ArithmeticOperation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;
    
    public static ArithmeticOperation fromString(String s){
        switch (s.toUpperCase()) 
            {
                case "ADD":
                    return ADD;
                case "SUBTRACT":
                    return SUBTRACT;
                case "MULTIPLY":
                    return MULTIPLY;
                case "DIVIDE":
                    return DIVIDE;
                default:
                    throw new AssertionError("Unknown operations " + s);
            }
    }
}
