class Funcionario extends Pessoa {
  public static final int PORC1PAR = 60;
  public static final int PORC2PAR = 40;

  private int matricula;
  private double salario;

  public Funcionario(int matricula, String nome, String sobrenome, double salario) {
    super(nome, sobrenome);
    setMatricula(matricula);
    setSalario(salario);
  }

  public Funcionario() {
    this(0, "_", "_", 0);
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public int getMatricula() {
    return this.matricula;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return this.salario;
  }

  public static double calcPorc(int porc, double val) {
    return val * porc / 100;
  }

  public double getSalarioPrimeiraParcela() {
    return calcPorc(Funcionario.PORC1PAR, getSalario());
  }

  public double getSalarioSegundaParcela() {
    return calcPorc(Funcionario.PORC2PAR, getSalario());
  }
}