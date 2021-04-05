class Professor extends Funcionario {
  public Professor(int matricula, String nome, String sobrenome, double salario) {
    super(matricula, nome, sobrenome, salario);
  }

  public Professor() {
    this(0, "_", "_", 0);
  }

  public double getSalarioPrimeiraParcela() {
    return getSalario();
  }

  public double getSalarioSegundaParcela() {
    return 0;
  }
}