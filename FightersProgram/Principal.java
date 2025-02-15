public class Principal {
    public static void main(String[] args) {
        Lutador [] L = new Lutador [5];
        L[0] = new Lutador("Pretty Boy","France", 31, 1.75, 68.9, 11, 3, 1);
        L[1] = new Lutador("Putscript", "Brazil", 29, 1.68, 57.8, 14, 2, 3);
        L[2] = new Lutador("Snapshadow", "USA", 35, 1.65, 80.9, 12, 2, 1);
        L[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
    

        L[0].toPresent();
    }
}
