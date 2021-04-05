class Main {
  public static void printClass(Object obj, String titulo) {
    System.out.println("--- " + titulo + " ---");
    System.out.println(obj);
    System.out.println(obj.getClass());
    System.out.println();
  }

  public static void printSalario(Funcionario func) {
    System.out.println("--- salario ---");

    System.out.println("primeira parcela: " + func.getSalarioPrimeiraParcela());

    System.out.println("segunda  parcela: " + func.getSalarioSegundaParcela());

    System.out.println();
  }

  public static void main(String[] args) {
    Pessoa meuNome = new Pessoa("Marcos", "Samuel");
    printClass(meuNome, "Eu");

    System.out.println("--- set nome ---");
    meuNome.setNome("Samuel");
    System.out.println(meuNome);
    System.out.println();

    System.out.println("--- set sobrenome ---");
    meuNome.setSobrenome("Miranda");
    System.out.println(meuNome);
    System.out.println();

    System.out.println("--- getters ---");
    System.out.println(meuNome.getNome());
    System.out.println(meuNome.getSobrenome());
    System.out.println(meuNome.getNomeCompleto());
    System.out.println();

    System.out.println("--- construtor sem nome ---");
    Pessoa semNome = new Pessoa();
    System.out.println(semNome);
    System.out.println();

    Funcionario zelador = new Funcionario(1, "Zelador", "Nervozo", 100);
    printClass(zelador, "Funcionario");

    printSalario(zelador);

    System.out.println("--- set salario 50 ---");
    zelador.setSalario(50);
    System.out.println();

    printSalario(zelador);

    Professor prof = new Professor(1, "Fabrício", "Valadares", 100);
    printClass(prof, "Professor");

    printSalario(zelador);

    System.out.println("--- set salario 50 ---");
    zelador.setSalario(1000000);
    System.out.println();

    printSalario(zelador);
  }
}