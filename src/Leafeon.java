public class Leafeon extends Eevee{
  public Leafeon() {
    super("Grama", 25.5, 100, 65, "Não possui");
}

@Override
public String ataque() {
    return "Folha Navalha - Razor Leaf";
}

@Override
public String defesa() {
    return "Síntese - Synthesis";
}

@Override
public String especial() {
    return "Giga Dreno - Giga Drain";
}
}