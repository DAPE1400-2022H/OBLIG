package Oblig3;
import static javax.swing.JOptionPane.*;
import java.util.*;


 class UnikeTall{
    public int[] list;
   public UnikeTall(int l) {
       list = new int[l];
   }
     public boolean sjekk(int x){
        for(int i=0; i<list.length; i++){
            if(x == list[i]){
                return false;
            }

        }
        return true;
     }
     public void fyll(){
         int x;
         for(int i=0; i< list.length; i++){
             x = (int)(Math.random()*11);
             if(sjekk(x)){
                 list[i] = x;
             }
             else{
                 i--;
             }
         }
     }

   public int max(){
       int y = list.length;
       Arrays.sort(list);
       return list[y-1];
   }
   public int min(){
       Arrays.sort(list);
       return list[0];
   }
   public double gjennomsnitt(){

        double sum =0;
        for (int i=0; i<list.length; i++){
            sum+= list[i];
        }
       return sum/(list.length);
   }
   public void finish(){
       String s= "   ";
       for(int i=0; i<list.length; i++){
           if(i%10==0){
                s+= "\n";
           }
           s += list[i] + " ";
       }
    showMessageDialog(null,  s + "\n minste tallet er " + min() + "\n største tallet er " + max() + "\n gjennomsnittet er "+ gjennomsnitt() );

   }

}

public class oppgave1 {
    public static void main(String[] args){
        int l=0;
        while(true){
            try{
                l = Integer.parseInt(showInputDialog("skriv inn arrays lengde"));
                if(l<0){
                    showMessageDialog(null,"tallet må være større enn 0");
                    continue;
                }
                break;
            }catch (Exception e){
               showMessageDialog(null, "skriv inn gyldig nummer");

            }
        }

    UnikeTall tall = new UnikeTall(l);
    tall.fyll();

  tall.finish();

    }



}
