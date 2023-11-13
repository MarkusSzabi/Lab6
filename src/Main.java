import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaStudenti = new ArrayList<String>();
        listaStudenti.add("Student1");
        listaStudenti.add("Student2");


        listaStudenti.remove("Student1");
        String student = listaStudenti.get(0);
        HashSet<String> colectieCarti = new HashSet<>();
        colectieCarti.add("Carte1");
        colectieCarti.add("Carte2");
        if (!colectieCarti.contains("Carte3")) ;
        colectieCarti.add("Carte3");
        colectieCarti.remove("Carte1");

        HashMap<String, Integer> noteStudenti = new HashMap<>();
        noteStudenti.put("Student1", 80);
        noteStudenti.put("Student2", 70);

        int notaStudenti1 = noteStudenti.get("Student1");
        int notaStudenti2 = noteStudenti.get("Student2");
        if (noteStudenti.containsKey("Student3")) {
            int notaStudent3 = noteStudenti.get("Student3");
        } else {
        }
            int sum;
            sum = notaStudenti1 + notaStudenti2;
            System.out.println(sum);
            int ma;
            ma = notaStudenti1 + notaStudenti2 / 2;
            System.out.println(ma);
    }
}



