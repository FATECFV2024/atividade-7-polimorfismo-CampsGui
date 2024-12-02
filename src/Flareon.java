public class Flareon extends Eevee{
  public Flareon() {
    super("Fogo", 25.0, 90, 65, "Não possui");
  }

  @Override
  public String ataque() {
      return "Brasa - Ember";
  }

  @Override
  public String defesa() {
      return "Face Assustadora - Scary Face";
  }

  @Override
  public String especial() {
      return "Chuva de Lava - Lava Plume";
  }
}

