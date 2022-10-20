package OBLIG2;
import static javax.swing.JOptionPane.*;
public class oppgave1 {
    public static void main(String [] args){

        int nederst= 0,overst=-1,sum=0;
        while(overst<nederst){
            try{
                nederst = Integer.parseInt(showInputDialog("Skriv inn nedre grense"));
                overst = Integer.parseInt(showInputDialog("Skriv inn øvre grense"));
            } catch (Exception e){
                nederst =0;
                overst =0;
            }
            if(overst<=nederst && overst != 0){
              showMessageDialog(null, "Nedre grense må være mindre enn den øvre");
            }
            else if(overst==nederst){
                showMessageDialog(null, "Du må skriv in gyldig tall");
                nederst= 0;
                overst=-1;
            }


        }
        for(int i=nederst ; i<=overst; i++){
            if(i==overst){
                sum+=i;
                System.out.print(" "+i + " = " + sum);
                continue;
            }
            System.out.print(" "+i + " +");
            sum+=i;
        }


    }
}
