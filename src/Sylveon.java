public class Sylveon extends Eevee{
  public Sylveon() {
    super("Fada", 23.5, 100, 95, "Não possui");
}

@Override
public String ataque() {
    return "Voz Desarmante - Disarming Voice";
}

@Override
public String defesa() {
    return "Tela de Luz - Light Screen";
}

@Override
public String especial() {
    return "Explosão Lunar - Moonblast";
}
}