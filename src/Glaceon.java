public class Glaceon extends Eevee{
  public Glaceon() {
    super("Gelo", 25.9, 80, 65, "Não possui");
}

@Override
public String ataque() {
    return "Vento Congelante - Icy Wind";
}

@Override
public String defesa() {
    return "Paisagem Nevada - Snowscape";
}

@Override
public String especial() {
    return "Nevasca - Blizzard";
}
}

