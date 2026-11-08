/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Linear {
    static int search(int[] numbers, int target, int index) {
        if (index == numbers.length){
            return -1;
        }
        
        if(numbers[index] == target){
            return index;
        }else{
            return search(numbers,target,index+1);
        }
    }


    public static void main(String[] args) {
        System.out.println(search(new int[]{2, 4, 6, 8,20,43},20,0));

        
    }
}


