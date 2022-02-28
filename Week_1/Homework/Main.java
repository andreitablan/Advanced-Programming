import static java.lang.Integer.parseInt;

public class Main {
    /*This is how i run the program:
      javac Main.java
      java Main 100 7 A C G T
     */
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        if (args.length > 0) {
            System.out.println("S-au citit cu succes argumentele.");
        } else
            System.out.println("Nu s-au citit argumentele.");

        int n = parseInt(args[0]);
        int p = parseInt(args[1]);

        if(n > 30000) {
            long endTime = System.nanoTime();
            long timeDifference = endTime - startTime;
            System.out.println("n > 30000, aplicatia nu va functiona. Timpul este " + timeDifference);
        }
        else {
            String alphabet="";
            for(int i=2;i<args.length; i++)
                alphabet += args[i];

            /*Validarea argumentelor*/
            if (n <= 0 || p <= 0) {
                System.out.println("Argumentele sunt invalide");
            }

            String[] words= new String[n];

            for (int i = 0; i < n; i++) {
                Word word = new Word(p, alphabet);
                words[i]=word.getWord();
            }

            for (int i = 0; i < n; i++)
                System.out.println(words[i]);

            Matrix M = new Matrix(n, words);

            M.calculateNeighbours(words);
            M.afisareListe();
        }
    }
}