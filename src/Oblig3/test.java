package Oblig3;
import java.util.Arrays;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class UnikTall
{
    private int[] TilfeldigTallArray;

    public UnikTall(int lengde) {
        TilfeldigTallArray = new int[lengde];
    }

    private boolean UndersokMetode(int arryTall) {
        boolean Unik = true;
        for (int i = 0; i < TilfeldigTallArray.length; i++) {
            if (arryTall == TilfeldigTallArray[i]) {
                Unik = false;
                break;
            }
        }
        return Unik;
    }

    public void Fyll() {
        int i, tall;
        for (i = 0; i < TilfeldigTallArray.length; i++) {
            tall = (int) (Math.random() * (900) + 100);
            while (!(UndersokMetode(tall))) {
                tall = (int) (Math.random() * (900) + (100));
            }
            TilfeldigTallArray[i] = tall;
        }
    }

    public int minsteTall() {
        Arrays.sort(TilfeldigTallArray);
        return TilfeldigTallArray[0];
    }

    public int storsteTall() {
        Arrays.sort(TilfeldigTallArray);
        return TilfeldigTallArray[TilfeldigTallArray.length - 1];
    }

    public double gjennomsnittet() {
        int i;
        double sum = 0;
        for (i = 0; i < TilfeldigTallArray.length; i++) {
            sum += TilfeldigTallArray[i];
        }
        return sum / (TilfeldigTallArray.length);
    }

    public String viseMatrise() {
        String elemanter = " ";
        for (int i = 0; i < TilfeldigTallArray.length; i++) {
            if (i % 8 == 0) {
                elemanter += "\n";
            }
            elemanter += TilfeldigTallArray[i] + " ";
        }
        return elemanter;
    }
}

public class test {
    public static void main(String[] args) {
        int elementerAntall = 0;
//        try {
//            elementerAntall = Integer.parseInt(showInputDialog
//                    ("Skriv inn element antall til matrisen "));
//        } catch (Exception e) {
//            elementerAntall = 0;
//        }
        while (elementerAntall == 0) {
            try {
                elementerAntall = Integer.parseInt(showInputDialog
                        ("Skriv inn element antall til matrisen "));
            } catch (Exception e) {
                elementerAntall = 0;
            }
        }
        UnikTall enMatrise = new UnikTall(elementerAntall);
        enMatrise.Fyll();
        showMessageDialog(null, enMatrise.viseMatrise() + "\n"
                + " Dette minste talle i matrisen er : " + enMatrise.minsteTall() + "\n"
                + " Dette stÃ¸rste tallet i matrisen er : " + enMatrise.storsteTall() + "\n"
                + " Gjennomsnittet til matrisen er : " +  String.format("%.2f",enMatrise.gjennomsnittet())
        );
    }
}


