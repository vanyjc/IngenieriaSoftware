/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is;
/**
 *
 * @author Vannie
 */
public class CamisasShop {
    int cantidad1;
    int cantidad2;
    int cantidad3;
    int precio1=190;
    int precio2=230;
    int precio3=310;

    public CamisasShop() {
    }

    public CamisasShop(int cantidad1, int cantidad2, int cantidad3) {
        this.cantidad1 = cantidad1;
        this.cantidad2 = cantidad2;
        this.cantidad3 = cantidad3;
    }

    public int getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public int getCantidad3() {
        return cantidad3;
    }

    public void setCantidad3(int cantidad3) {
        this.cantidad3 = cantidad3;
    }

    public int getPrecio1() {
        return precio1;
    }

    public void setPrecio1(int precio1) {
        this.precio1 = precio1;
    }

    public int getPrecio2() {
        return precio2;
    }

    public void setPrecio2(int precio2) {
        this.precio2 = precio2;
    }

    public int getPrecio3() {
        return precio3;
    }

    public void setPrecio3(int precio3) {
        this.precio3 = precio3;
    }    
    
    public int calcularPorCamisa(int cantidad,int precio){
        precio=cantidad*precio;
        return precio;
    }
    
    public float calcularSinDesc(){
        float totalSinDesc = 0;
        totalSinDesc= CamisasShop.this.calcularPorCamisa(cantidad1,precio1)+CamisasShop.this.calcularPorCamisa(cantidad2, precio2)
                +CamisasShop.this.calcularPorCamisa(cantidad3, precio3);
        return totalSinDesc;
    }
    
    public double calcularConDesc(){
        double total = 0;
        double desc;
        int cantidadFinal = cantidad1+cantidad2+cantidad3;
        if (cantidadFinal >0 && cantidadFinal <=2){
            total=CamisasShop.this.calcularSinDesc();            
        }else if(cantidadFinal >=3 && cantidadFinal<=5){
            desc=CamisasShop.this.calcularSinDesc()*0.05;
            total=CamisasShop.this.calcularSinDesc()-desc;
        }else if(cantidadFinal>5){
            desc=CamisasShop.this.calcularSinDesc()*0.08;
            total=CamisasShop.this.calcularSinDesc()-desc;
        }
        return total;
    }
    
}
