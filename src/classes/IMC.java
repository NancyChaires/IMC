/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author josemtz
 */
public class IMC {
    
    private double peso;
    private double estatura;

    public IMC(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public double getValor() {
        return this.peso / Math.pow(this.estatura, 2);
    }
    
    public String getEstadoNutricional() {
        double imc = getValor();
        if (imc < 18.5) {
            return "Peso bajo";
        }
        else if (imc < 25.0) {
            return "Peso normal";
        }
        else if (imc < 30.0) {
            return "Sobrepeso";
        }
        else if (imc < 40.0) {
            return "Obesidad";
        }
        else {
            return "Obesidad extrema";
        }  
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
}
