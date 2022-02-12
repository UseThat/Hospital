package app;

import logic.Hospital;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        int number;
        do {
            actionList();
            number = hospital.switchNumber();
            switch (number){
                case 0:
                    System.out.println("Bye bye!");
                    break;
                case 1:
                    hospital.addPatient();
                    break;
                case 2:
                    hospital.printPatient();
                    break;
                default:
                    System.out.println("No option choose");
            }
        }while(number!=0);
        hospital.close();



    }
    private static void actionList(){
        System.out.println("0 - exit");
        System.out.println("1 - add patient");
        System.out.println("2 - print patient");
    }


}
