package exercises;

public class EnumInSwitch {
    Names name;

    public EnumInSwitch(Names name) {
        this.name = name;
    }

    public static void main(String[] args) {
        EnumInSwitch IrynaPresentAtOffice = new EnumInSwitch(Names.IRYNA);
        IrynaPresentAtOffice.schedule();
        EnumInSwitch OlegPresentAtOffice = new EnumInSwitch(Names.OLEG);
        OlegPresentAtOffice.schedule();
    }

    public void schedule() {
        switch (name) {
            case IRYNA: {
                System.out.println("Ira: Tuesday and Thursday at office");
                break;
            }
            case NADIA: {
                System.out.println("Nadia: Tuesday and  Thursday at office");
                break;
            }
            case OLEG: {
                System.out.println("Oleg: All days at office");
                break;
            }
        }
    }
}

// class that contains list of constant
enum Names {
    IRYNA(30), NADIA, OLEG;

    Names() {
    }

    Names(int age) {

    }
}

