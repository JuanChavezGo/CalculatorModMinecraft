package modelo;

public class Operacion {
    private int numero1, numero2, resultado;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int sumar(){
        return resultado = numero1 + numero2;
    }
    
    public int restar(){
        return resultado = numero1 - numero2;
    }
    
    public int multiplicar(){
        return resultado = numero1 * numero2;
    }
    
    public int dividir(){
        return resultado = numero1 / numero2;
    }
}
