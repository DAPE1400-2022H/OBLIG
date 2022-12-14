package Oblig3;
import static javax.swing.JOptionPane.*;
import java.util.*;


 class UnikeTall{
    private int[] list;
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
             x = (int)(Math.random()*(900)+100);
             if(sjekk(x)){
                 list[i] = x;
             }
             else{
                 i--;
             }
         }
     }

     public int min(){
         Arrays.sort(list);
         return list[0];
     }
   public int max(){
       Arrays.sort(list);
       return list[list.length - 1];
   }

   public double gjennomsnitt(){
        double sum =0;

//        for(int i: list){
//            sum+= i;
//        }
        for (int i=0; i<list.length; i++){
            sum+= list[i];
        }
       return sum/(list.length);
   }
   public void finish(){
       String s= "   ";
       for(int i=0; i<list.length; i++){
           if(i%8==0){
                s+= "\n";
           }
           s += list[i] + " ";
       }
    showMessageDialog(null,  s + "\nMinste tall er " + min() +
            "\nStørste tall er " + max() + "\nGjennomsnittet er "+ String.format("%.2f",gjennomsnitt()) );
   }

}

public class oppgave1 {
    public static void main(String[] args){
        int l=0;
        while(true){
            try{
                l = Integer.parseInt(showInputDialog("Skriv inn arrays lengde"));
                if(l<=0){
                    showMessageDialog(null,"Tallet må være større enn 0");
                    continue;
                }
                break;
            }catch (Exception e){
               showMessageDialog(null, "Skriv inn gyldig tall");
            }
        }
    UnikeTall tall = new UnikeTall(l);
    tall.fyll();
    tall.finish();

    }
}
