import java.util.HashMap;
import java.util.Scanner;

public class GestionareStudenti {
    public static void main(String[] args){
                HashMap<String, Integer> noteStudenti = new HashMap<>();
                Scanner scanner = new Scanner(System.in);
                int optiune;
        do {
            System.out.println("Optiuni de Meniu:");
            System.out.println("1. Adaugare student");
            System.out.println("2. Afisare detalii student");
            System.out.println("3. Iesire");
            System.out.print("Introduceti optiunea dvs.: ");
            optiune = scanner.nextInt();

            switch(optiune){

                case 1:
                    System.out.println("Numele studentului adaugat:");
                            String numeStudent = scanner.next();
                    System.out.println("Varsta studentului adaugat: ");
                            int varstaStudent = scanner.next();
                            noteStudenti.put(numeStudent, varstaStudent);
                            System.out.println("Studentul a fost adaugat");
                            break;

                case 2:
                    System.out.print("Introduceti numele studentului pentru a afisa detalii: ");
                    String numeCautat = scanner.next();
            }




    }

}
