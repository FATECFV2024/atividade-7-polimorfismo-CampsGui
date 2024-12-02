public class Eevee{
  String tipo;
  Double peso;
  int altura;
  int hp; // mesmo que hit point
  String subtipo;  //atributo especifico dentro do Jolteon

  public Eevee(String tipo, Double peso, int altura, int hp, String subtipo) {
      this.tipo = tipo;
      this.peso = peso;
      this.altura = altura;
      this.hp = hp;
      this.subtipo = subtipo;
  }
  
  public String getTipo() {
      return tipo;
  }

  public void setTipo(String tipo) {
      this.tipo = tipo;
  }

  public Double getPeso() {
      return peso;
  }

  public void setPeso(Double peso) {
      this.peso = peso;
  }

  public int getAltura() {
      return altura;
  }

  public void setAltura(int altura) {
      this.altura = altura;
  }

  public int getHp() {
      return hp;
  }

  public void setHp(int hp) {
      this.hp = hp;
  }

  public String getSubtipo() {
      return subtipo;
  }

  public void setSubtipo(String subtipo) {
      this.subtipo = subtipo;
  }

  public String ataque(){
      return "Ataque rápido";
  }  
      
  public String defesa(){
      return "Desvio";
  } 

  public String especial(){
      return "Tri-ataque";
  }   

  public void Imprimir() {
      System.out.println("Tipo: " + tipo);
      System.out.println("Peso: " + peso + " kg");
      System.out.println("Altura: " + altura + " cm");
      System.out.println("HP: " + hp);
      System.out.println("Subtipo: " + subtipo);
      System.out.println("Ataque: " + ataque());
      System.out.println("Defesa: " + defesa());
      System.out.println("Especial: " + especial());
  }    
}