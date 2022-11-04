/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4p7;

/**
 *
 * @author Andre
 */
public class Rational{
    private int numarator,numitor;

    public Rational(){
        this.numitor=1;
    }

    public Rational(int numarator,int numitor){
        int c=cmmdc(numarator,numitor);
        this.numarator=numarator/c;
        this.numitor=numitor/c;
    }

    private int  cmmdc(int u, int v){
        if(v==0) return u;
        return cmmdc(v,u%v);
    }

    public Rational aduna(Rational N){
        int numaratorRez=this.numarator*N.numitor+this.numitor*N.numarator;
        int numitorRez=this.numitor*N.numitor;

        return new Rational(numaratorRez,numitorRez);
    }

    public Rational scade(Rational N){
        int numaratorRez=this.numarator*N.numitor-this.numitor*N.numarator;
        int numitorRez=this.numitor*N.numitor;

        return new Rational(numaratorRez,numitorRez);
    }

    public Rational inmulteste(Rational N){
        return new Rational(numarator*N.numarator,numitor*N.numitor);
    }

    public Rational imparte(Rational N){
        return new Rational(numarator*N.numitor,numitor*N.numarator);
    }

    public void afiseaza(){
        System.out.println(numarator+"/"+numitor);
    }

    public void afiseazaVirgula(){
        System.out.println((double)numarator/(double)numitor);
    }
}