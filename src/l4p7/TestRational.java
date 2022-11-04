/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4p7;

/**
 *
 * @author Andre
 */
public class TestRational {

    public static void main(String[] args) {
        Rational n1=new Rational(1,2);
        Rational n2=new Rational(9,15);
        
        System.out.println("Numerele in forma a/b: ");
        n1.afiseaza();
        n2.afiseaza();
        System.out.println("Numerele in format virgula flotanta: ");
        n1.afiseazaVirgula();
        n2.afiseazaVirgula();
        Rational suma=n1.aduna(n2);
        System.out.println("Suma: ");
        suma.afiseaza();
        Rational scaderea=n1.scade(n2);
        System.out.println("Diferenta: ");
        scaderea.afiseaza();
        Rational inmultirea=n1.inmulteste(n2);
        System.out.println("Inmultirea: ");
        inmultirea.afiseaza();
        Rational impartirea=n1.imparte(n2);
        System.out.println("Impartirea: ");
        impartirea.afiseaza();
        
        
    }
    
}
