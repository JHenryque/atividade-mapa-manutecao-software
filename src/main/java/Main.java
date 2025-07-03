public class Main {
    public static void main(String[] args) {
        // o polimofismo, o animal sera para qual quer tipo for animal
        Animal bicho = new Animal("O Bicho ");
        bicho.fazSom();

        // a classe herança do cachorro vem do animal
        Animal cachorro = new Cachorro("Cachorro");
        cachorro.fazSom();
    }
}

