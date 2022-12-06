package eksamen;
import java.util.Arrays;

class Trekning{

    private int[] tall = new int[7];
    private int x;


    private boolean sjekk( int x){
        for(int i=0; i<7; i++){
            if(x == tall[i]){
                return true;
            }

        }
        return false;


    }
    private void fyll(){

        for(int i=0; i<7; i++){
            x = (int) (Math.random() * 2);
            if(sjekk(x)){
                tall[i] = x;

            } else {
                i--;
            }


        }


    }
    public int[] vinnere(){
        fyll();
        Arrays.sort(tall);
        return tall;

    }



}
public class test1 {
    public static void main(String[] args) {

        Trekning tall = new Trekning();
        int[] t =  tall.vinnere();
            for(int i=0; i<7; i++){
                System.out.print(t[i] + " ");

            }
    }
}
