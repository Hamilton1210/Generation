public class JogadorDeFutebol {
    private String nome;
    public double energia;
    private double alegria;
    private double gols;
    private double experiência;

    public void fazerGol(){
        this.energia -= 5;
        this.alegria += 10;
        this.gols += 1;
        System.out.println("Goooll");
    }
    public void correr(){
        this.energia -= 10;
        System.out.println("Cansei");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getAlegria() {
        return alegria;
    }

    public void setAlegria(double alegria) {
        this.alegria = alegria;
    }

    public double getGols() {
        return gols;
    }

    public void setGols(double gols) {
        this.gols = gols;
    }

    public double getExperiência() {
        return experiência;
    }

    public void setExperiência(double experiência) {
        this.experiência = experiência;
    }

    public JogadorDeFutebol(String nome, double energia, double alegria, double gols, double experiência) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiência = experiência;
    }
}
