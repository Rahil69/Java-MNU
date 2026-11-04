/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.mavenproject3;
public class InputGuard {
    public static void main(String[] args) {
        String value = "sajdk";
        // TODO: convert value to an integer, catching invalid input.
        try{
            int number = Integer.parseInt(value);
            System.out.println("Converted to int" + number);
            
            
        }catch(NumberFormatException e){
            System.out.println("Invalid Input: " + value + "Is not a valid integer");
        }
        System.out.println("Entered: " + value);
    }
}

