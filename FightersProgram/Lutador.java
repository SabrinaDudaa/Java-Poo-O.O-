public class Lutador implements Informacoes {
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int victory;
    private int defeat;
    private int draw;

    public String getName() {
        return name;
    }

    public void setName(String na) {
        this.name = na;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String naci) {
        this.nationality = naci;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double w) {
        this.weight = w;
        setCategory();  // Atualiza automaticamente a categoria com base no peso
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() { // Método agora é privado, pois só é chamado internamente
        if (this.weight < 52.2) {
            this.category = "Invalid";
        } else if (this.weight <= 70.3) {
            this.category = "Slight";
        } else if (this.weight <= 83.9) {
            this.category = "Mid";
        } else if (this.weight <= 120.2) {
            this.category = "Heavy";
        } else {
            this.category = "Invalid";
        }
    }

    public int getVictory() {
        return victory;
    }

    public void setVictory(int vc) {
        this.victory = vc;
    }

    public int getDefeat() {
        return defeat;
    }

    public void setDefeat(int df) {
        this.defeat = df;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int dr) {
        this.draw = dr;
    }

    public Lutador(String na, String naci, int a, double h, double w, int vc, int df, int dr) {
        this.name = na;
        this.nationality = naci;
        this.age = a;
        this.height = h;
        this.setWeight(w);  // Já atualiza a categoria
        this.victory = vc;
        this.defeat = df;
        this.draw = dr;
    }

    @Override
    public void toPresent() {
        System.out.println("Fighter: " + getName());
        System.out.println("Origin: " + getNationality());
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Weighing: " + getWeight());
        System.out.println("Category: " + getCategory());
        System.out.println("Won: " + getVictory());
        System.out.println("Defeat: " + getDefeat());
        System.out.println("Tied: " + getDraw());
    }

    @Override
    public void status() {
        System.out.println(getName());
        System.out.println("Weight Category: " + getCategory());
        System.out.println("Victories: " + getVictory());
        System.out.println("Defeats: " + getDefeat());
        System.out.println("Draws: " + getDraw());
    }

    @Override
    public void winFight() {
        setVictory(getVictory() + 1);
    }

    @Override
    public void defeatFight() {
        setDefeat(getDefeat() + 1);
    }

    @Override
    public void drawFight() {
        setDraw(getDraw() + 1);
    }
}
