package structural.composite;

public class Test {
    public static void main(String[] args) {
//        iteratorTest();
        client();
    }

    private static void iteratorTest() {
        Title stateAffair = new Department("Department of State Affair", "highest executive institution of the imperial government.");

        Title personel = new Ministry("Ministry of Personel", "appointments, merit ratings, promotions, and demotions of officials, as well as granting of honorific titles.");
        Title revenue = new Ministry("Ministry of Revenue", "gathering census data, collecting taxes and handling state revenues, while there were two offices of currency that were subordinate to it.");
        // 尽量使用Title而非具体的subclass

        stateAffair.addReport(personel);
        stateAffair.addReport(revenue);

        stateAffair.print();
    }

    private static void client() {
        Title emperor = new Emperor("Emperor", "being the highest representative of the nation.");

        Title secretariat = new Department("Secretariat", "proposing and drafting all imperial decrees, but its actual function varied at different times.");
        Title stateAffair = new Department("Department of State Affair", "highest executive institution of the imperial government.");
        Title chancellery = new Department("Chancellery", "advise the Emperor and the Central Secretariat, and to review edicts and commands.");

        Title personel = new Ministry("Ministry of Personel", "appointments, merit ratings, promotions, and demotions of officials, as well as granting of honorific titles.");
        Title revenue = new Ministry("Ministry of Revenue", "gathering census data, collecting taxes and handling state revenues, while there were two offices of currency that were subordinate to it.");
        Title rites = new Ministry("Ministry of Rites ", "state ceremonies, rituals and sacrifices");
        Title war = new Ministry("Ministry of War", "appointments, promotions and demotions of military officers, the maintenance of military installations, equipment and weapons, as well as the courier system.");
        Title justice = new Ministry("Ministry of Justice", "judicial and penal processes, but had no supervisory role over the Censorate or the Grand Court of Revision.");
        Title work = new Ministry("Ministry of Works", "government construction projects, hiring of artisans and laborers for temporary service, manufacturing government equipment, the maintenance of roads and canals, standardisation of weights and measures, and the gathering of resources from the countryside.");

        emperor.addReport(secretariat);
        emperor.addReport(stateAffair);
        emperor.addReport(chancellery);

        // emperor.addReport(work); Incorrect child type

        stateAffair.addReport(personel);
        stateAffair.addReport(revenue);
        stateAffair.addReport(rites);
        stateAffair.addReport(war);
        stateAffair.addReport(justice);
        stateAffair.addReport(work);

        emperor.print();
        System.out.println();

        stateAffair.print();
        System.out.println();

        war.print();
    }
}
