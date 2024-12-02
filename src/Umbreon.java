public class Umbreon extends Eevee{
  public Umbreon() {
    super("Noturno", 27.0, 100, 95, "Não possui");
}

@Override
public String ataque() {
    return "Rosnado - Snarl";
}

@Override
public String defesa() {
    return "Raio Lunar - Moonlight";
}

@Override
public String especial() {
    return "Pulso Sombrio - Dark Pulse";
}
}