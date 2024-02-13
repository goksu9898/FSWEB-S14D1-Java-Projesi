package main;

public class HRManager extends Employee{
    private JuniorDeveloper[] jrDev;
    private SeniorDeveloper[] srDev;
    private MidDeveloper[] midDev;
    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        srDev = new SeniorDeveloper[10];
        midDev = new MidDeveloper[10];
        jrDev = new JuniorDeveloper[10];
    }
    @Override
    public void work(){
        System.out.println("HrManager starts to working");
        setSalary(15);
    }
    public void addEmployee(SeniorDeveloper seniorDeveloper){
        for(int i=0; i<srDev.length;i++){
           if(srDev[i]==null){
               srDev[i]=seniorDeveloper;
               return;
           }
           else if(srDev[i].getId()==seniorDeveloper.getId()){
               System.out.println(seniorDeveloper.getName()+ " daha once listeye eklenmistir.");
               return;
           }
        }
        System.out.println("liste dolmustur.");
    }
    public void addEmployee(MidDeveloper midDeveloper){
        for(int i=0; i<midDev.length;i++){
            if(midDev[i]==null){
                midDev[i]=midDeveloper;
                return;
            }
            else if(midDev[i].getId()==midDeveloper.getId()){
                System.out.println(midDeveloper.getName()+ " daha once listeye eklenmistir.");
                return;
            }

        }
        System.out.println("liste dolmustur.");
    }
    public void addEmployee(JuniorDeveloper juniorDeveloper){
        for(int i=0; i<jrDev.length;i++){
        if(jrDev[i]==null){
            jrDev[i]=juniorDeveloper;
            return;
        }
        else if(jrDev[i].getId()==juniorDeveloper.getId()) {
            System.out.println(juniorDeveloper.getName() + " daha once listeye eklenmistir.");
            return;
        } 
        }
        System.out.println("liste dolmustur.");
    }
}
