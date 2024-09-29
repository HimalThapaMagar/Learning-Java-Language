public class Fish implements Predator,Prey{

    @Override
    public void hunts() {
        System.out.println("Fish hunting");
    }

    @Override
    public void run(){
        System.out.println("Fish is swimming away tadatadaadaaaaa");
    }
}
