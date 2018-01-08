public class Main {

    public static void main(String[] args) {

        Authors[] autoriJunimea = new Authors[2];
        autoriJunimea[0] = new Authors("Mihai Eminescu","eminescu@gmail.com",'M');
        autoriJunimea[1] = new Authors("Ion Creanga","creanga@gmail.com",'M');

        Book carticica = new Book("Luceafarul", autoriJunimea,120,2);
        System.out.println(carticica);
    }

}
