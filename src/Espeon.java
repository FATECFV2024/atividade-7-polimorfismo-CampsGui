public class Espeon extends Eevee{
  public Espeon() {
    super("Psíquico", 26.5, 90, 65, "Não possui");
}

@Override
public String ataque() {
    return "Confusão - Confusion";
}

@Override
public String defesa() {
    return "Troca de Força - Power Swap";
}

@Override
public String especial() {
    return "Raio Psíquico - Psybeam";
}
}
