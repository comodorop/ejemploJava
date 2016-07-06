/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equals;

/**
 *
 * @author Torres
 */
public class Test {

    public static void main(String[] args) {
        String valor = new String("hola");
        String x = new String("hola");
        System.out.println(valor == x);
        System.out.println(valor.equals(x));
    }
}
