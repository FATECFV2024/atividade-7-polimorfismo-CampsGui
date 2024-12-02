public class Vaporeon extends Eevee{
  public Vaporeon() {
    super("Água", 29.0, 100, 130, "Não possui");
}

@Override
public String ataque() {
    return "Jato de Água - Water Gun";
}

@Override
public String defesa() {
    return "Aqua Arco - Aqua Ring";
}

@Override
public String especial() {
    return "Hidro Bomba - Hydro Pump";
}
}
