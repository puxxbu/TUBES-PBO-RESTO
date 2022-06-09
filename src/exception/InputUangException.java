/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author LENOVO
 */
public class InputUangException extends Exception {
    public String message(){
        return "Inputan uang masih kurang dari subtotal pesanan !";
    }
}
