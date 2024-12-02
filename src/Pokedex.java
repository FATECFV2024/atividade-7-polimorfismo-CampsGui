public class Pokedex {
  public static void main(String[] args) {
      Eevee e = new Eevee("Normal", 6.5, 30, 55, "Não possui");
      Vaporeon v = new Vaporeon();
      Jolteon j = new Jolteon();
      Flareon f = new Flareon();
      Espeon es = new Espeon();
      Umbreon u = new Umbreon();
      Leafeon l = new Leafeon();
      Glaceon g = new Glaceon();
      Sylveon s = new Sylveon();

      System.out.println("Eu sou: Eevee");
      e.Imprimir();

      System.out.println("\n");

      System.out.println("Eu sou: Vaporeon");
      v.Imprimir();

      System.out.println("\n");

      System.out.println("Eu sou: Jolteon");
      j.Imprimir();

      System.out.println("\n");

      System.out.println("Eu sou: Flareon");
      f.Imprimir();

      System.out.println("\n");

      System.out.println("Eu sou: Espeon");
      es.Imprimir();

      System.out.println("\n");

      System.out.println("Eu sou: Umbreon");
      u.Imprimir();

      System.out.println("\n");

      System.out.println("Eu sou: Leafeon");
      l.Imprimir();

      System.out.println("\n");

      System.out.println("Eu sou: Glaceon");
      g.Imprimir();

      System.out.println("\n");

      System.out.println("Eu sou: Sylveon");
      s.Imprimir();
  }
}