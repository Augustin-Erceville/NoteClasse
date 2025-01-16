import java.util.ArrayList;
import java.util.Scanner;

public class ExerciceArrayList {
    public static void main(String[] args) {
        int a = 1;
        Scanner clavier = new Scanner(System.in);
        ArrayList<Double> notes = new ArrayList<Double>();
        String reponse = "";

        do{
            System.out.println("\n============ MENU ============");
            System.out.println("1. Afficher les notes");
            System.out.println("2. AJouter une note");
            System.out.println("3. Afficher une note");
            System.out.println("4. Modifier une note");
            System.out.println("5. Afficher la moyenne");
            System.out.println("0. Quitter");
            System.out.println("==============================");
            System.out.print(">>> Choix n°");
            int menu = clavier.nextInt();
            int nbrnote;
            switch(menu) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    nbrnote = 0;
                    while (!reponse.toLowerCase().equals("stop")){
                        nbrnote++;
                        System.out.print("Note n°" +nbrnote+ ": ");
                        if(clavier.hasNextDouble()){
                            notes.add(clavier.nextDouble());
                            clavier.skip("\n");
                        }else{
                            reponse = clavier.nextLine();
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }while(a==1);
    }
}