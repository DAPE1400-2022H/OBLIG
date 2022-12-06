package eksamen;
import java.util.ArrayList;
import java.util.Arrays;
class Valuta{
    private String Valname;
    private double Val;

    public Valuta(String v , double va){

        this.Valname = v;
        this.Val = va;
    }

    public String getValname() {
        return Valname;
    }

    public double getVal() {
        return Val;
    }
}
class ValutaKalkulator {
    private ArrayList<Valuta> valutakurser = new ArrayList<>();
    public ValutaKalkulator(ArrayList<Valuta> f){
        this.valutakurser = f;

    }
    public double beregnKurs(String valuta) {
        for(Valuta k :valutakurser){
            if(k.getValname().equals(valuta)){
                return k.getVal();
            }

        }
        return 0;
    }
}
public class test3 {
    public static void main(String[] args) {
        Valuta usd = new Valuta("USD" , 11.5);
        Valuta eur = new Valuta("eur" , 10);
        Valuta dkk = new Valuta("DKK" , 75);
        ArrayList<Valuta> f = new ArrayList<>();
        f.add(usd);
        f.add(eur);
        f.add(dkk);
        ValutaKalkulator k = new ValutaKalkulator(f);

        System.out.println("EUR = " + k.beregnKurs("eur") );
        System.out.println("USD = " + k.beregnKurs("USD") );
        System.out.println("DKK = " + k.beregnKurs("DKK") );


    }
}
