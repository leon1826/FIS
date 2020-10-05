/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author katht
 */
public class Calculadora {
    
    private float n1;
    private float n2;
    
    public Calculadora(){
        
    }
    
    public Calculadora(float n1, float n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public float sumar(){
        float suma = this.n1 + this.n2;
        return suma;
    }
    
    public float restar(){
        float resta = this.n1 - this.n2;
        return resta;
    }
    
    public float multiplicar(){
        float multiplicacion = this.n1 * this.n2;
        return multiplicacion;
    }
    
    public float dividir(){
        float division = this.n1 / this.n2;
        return division;
    }

    public float getN1() {
        return n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    
    
}
