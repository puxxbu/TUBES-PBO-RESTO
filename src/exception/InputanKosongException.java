/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author Teprutz tes
 */ 
public class InputanKosongException extends Exception {
    public String message(){
        return "Field input tidak boleh kosong!";
    }
}
