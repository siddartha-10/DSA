package staticExample;

public class Main {
    public static void main(String[] args) {
        Human messi = new Human(35,"Lionel",100000,true);
        Human sid = new Human(22,"sid",1000,false);
        Human cris = new Human(38,"cris",1000,true);

        System.out.println(messi.age+"\t"+messi.name+"\t"+messi.salary+"\t"+messi.marriage);
        System.out.println(sid.age+"\t"+sid.name+"\t"+sid.salary+"\t"+sid.marriage);
        System.out.println(cris.age+"\t"+cris.name+"\t"+cris.salary+"\t"+cris.marriage);
        
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
