import java.util.ArrayList;
import java.util.Scanner;

public class ExerciceArrayList {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        ArrayList<Double> notes = new ArrayList<Double>();
        String reponse = "";
        while (!reponse.toLowerCase().equals("stop")){
            System.out.print("Veuillez saisir votre note (stop pour terminer) : ");
            if(clavier.hasNextDouble()){
                notes.add(clavier.nextDouble());
                clavier.skip("\n");
            }else{
                reponse = clavier.nextLine();
            }
        }
        for(double note : notes){
            System.out.println(note);
        }
    }
}