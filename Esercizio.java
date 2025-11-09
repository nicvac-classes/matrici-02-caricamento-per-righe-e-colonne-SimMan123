import java.util.Scanner;

public class Esercizio {

    public static void riempiPerRighe(int[][] matrice, Scanner sc) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j] = sc.nextInt();
            }
        }
    }

    public static void riempiPerColonne(int[][] matrice, Scanner sc) {
        for (int j = 0; j < matrice[0].length; j++) {
            for (int i = 0; i < matrice.length; i++) {
                matrice[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int righe = sc.nextInt();
        int colonne = sc.nextInt();
        int[][] matrice = new int[righe][colonne];
        riempiPerRighe(matrice, sc);
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
