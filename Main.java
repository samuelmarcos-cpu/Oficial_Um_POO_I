class Main {
  public static void main(String[] args) {
    System.out.println("--- construtor ---");
    Pessoa meuNome = new Pessoa("Marcos", "Samuel");
    System.out.println(meuNome);
    System.out.println(meuNome.getClass());
    System.out.println();

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
  }
}