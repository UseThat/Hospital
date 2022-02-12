package logic;

import model.Patient;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hospital {
    private final int maxPatient = 2;
    private Patient[] patients = new Patient[maxPatient];
    private int patientCounter;
    private Scanner scanner;

    public Hospital(){
        scanner = new Scanner(System.in);
    }

    public void close(){
        scanner.close();
    }

    public void addPatient(){
        if(patientCounter < maxPatient){
            createPatient();
            patientCounter ++;
            System.out.println("Patient created!");
        }else{
            System.out.println("Patient list full");
        }
    }

    private void createPatient(){
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Document id: ");
        String document = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        patients[patientCounter] = new Patient(firstName,lastName, document,age);
    }

    public void printPatient(){
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public int switchNumber(){
        int number  = scanner.nextInt();
        scanner.nextLine();
        return number;
    }



}
