public class Matrix {
    boolean[][] matrix = new boolean[100][100];
    private static int n;
    String[][] neighbours= new String[100][100];
    public Matrix(int nu, String[] words) {
        n=nu;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++){
                    if(isNeighbour(words[i],words[j]))
                        matrix[i][j]=matrix[j][i]=true;
            }
        }
    }
    public boolean isNeighbour (String word1, String word2)
    {
        for( int i=0; i<word1.length();i++) {
            for (int j = 0; j < word2.length(); j++) {
                if(word1.charAt(i) == word2.charAt(j))
                    return true;
            }
        }
        return false;
    }

    /*
    public void afisareMatrice()
    {
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                System.out.println(" " + matrix[row][col]);
            }
            System.out.println();
        }
    }*/

    public void calculateNeighbours(String[] words)
    {
        for(int i=0;i<n-1;i++)
        {
            int maxim=0;
            for(int j=i+1;j<n;j++)
                {
                 if(matrix[i][j]) {
                     neighbours[i][maxim] = words [j];
                     maxim +=1;
                 }
                }
        }
    }

    public void afisareListe()
    {
        for(int i=0; i < neighbours.length; i++) {
            for (int c = 0; c < neighbours[i].length; c++) {
                if(neighbours[i][c]!=null)
                    System.out.printf(" " + neighbours[i][c]);
            }
            System.out.println();
        }
    }
}
