public class Cachorro extends Animal {

    public Cachorro(String name) {
        super(name);
    }

    @Override
    public void fazSom() {
        System.out.println(this.name + " diz: Au Au!");
    }
}
