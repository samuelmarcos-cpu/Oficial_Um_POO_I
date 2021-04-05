import java.lang.reflect.Constructor;

class Pessoa {
  public static final String SEP = " ";

  private String nome;
  private String sobrenome;

  public Pessoa(String nome, String sobrenome) {
    this.setNome(nome);
    this.setSobrenome(sobrenome);
  }

  public Pessoa() {
    this("_", "_");
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public String getNomeCompleto() {
    return getNome() + Pessoa.SEP + getSobrenome();
  }

  public String toString() {
    return getNomeCompleto();
  }
}