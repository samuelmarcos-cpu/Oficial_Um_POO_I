class Professor extends Funcionario {
  public Professor(int matricula, String nome, String sobrenome, double salario) {
    super(matricula, nome, sobrenome, salario);
  }

  public double getSalarioPrimeiraParcela() {
    return getSalario();
  }

  public double getSalarioSegundaParcela() {
    return 0;
  }
}