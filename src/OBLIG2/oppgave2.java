package OBLIG2;
import static javax.swing.JOptionPane.*;


class Tallspill {
     public  int Tall;
    public  int nyttTall() {
        return (int) (Math.random() * 201);
    }

    public void visMelding(String melding){
        showMessageDialog(null, melding);
    }

    private void forLite(int tall){
        visMelding( tall +" er for lite" + "\n" + "prøv igjen!");
   }

    private void forStort(int tall) {
        visMelding( tall +" er for stort" + "\n" + "prøv igjen!");

    }

    public void avsluttRunde(int antall, int gjetning) {
        visMelding( gjetning + " er riktig " + "\n" + "du gjettet riktig på "+ antall+ " forsøk");
    }

    public void kjørSpill() {

        Tall =   nyttTall();

        int s , t =0;
       while(true){
           try{
               s = Integer.parseInt(showInputDialog("jeg tenker på et tall mellom 0 og 200" + "\n" + " prøv å gjett tallet:"));

           }catch (Exception e){
               s=-1;
           }
           if(s == -1){

               visMelding("Talle er ugyldig");
               continue;
           }

               if(s > Tall){
               forStort(s);
           }
           else if(s<Tall){
               forLite(s);
           }
           else {
               avsluttRunde(t , s);
               break;
           }

        t++;


       }
    }
}
public class oppgave2 {
    public static void main(String args []){
        Tallspill spill= new Tallspill();
        int s , o=0;


    while(true){

        s = Integer.parseInt(showInputDialog("for å kjør spillet skriv 1" + "\n"+ "for å avslutte spillet skriv 2"  ));

        switch (s){
            case 1 : {
                spill.kjørSpill();
                break;
            }
            case 2: o=-1; break;

        }
        if(o==-1){
            break;
        }


    }




    }
}
