package arrayhealthcaremanagementsystem;

import arrayhealthcaremanagementsystem.model.Person;
import arrayhealthcaremanagementsystem.service.PersonService;

import java.util.Scanner;

public class HealthcareDemoOverArray {

    private static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {

        HealthcareDemoOverArray healthcareDemoOverArray = new HealthcareDemoOverArray();
        Person []person=new Person[10];


        int option = 0;
        do {
            System.out.println("------------Healthcare-Management-System--------------");
            System.out.println("please choose the option");
            System.out.println("1.create person");
            System.out.println("2.create hospital");
            System.out.println("3. Create doctors");
            System.out.println("4. Create departments");
            System.out.println("5. Create appointment");
            System.out.println("6. Create prescription");
            System.out.println("7. Create billing");
            System.out.println("0. Exit project");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {

                case 1:
                    Person registerPerson = healthcareDemoOverArray.registerPerson();
                    System.out.println("create person" );
                    break;

//                case 2:
//                    Hospital createHospital = healthcareDemoOverSwitch.createHospital();
//                    System.out.println("create hospital"+createHospital);
//                    break;
//
//                case 3:
//                    Doctor createDoctor = healthcareDemoOverSwitch.createDoctor();
//                    System.out.println("create doctor"+createDoctor);
//                    break;
//
//                case 4:
//                    Department createDepartment = healthcareDemoOverSwitch.createDepartment();
//                    System.out.println("create department"+createDepartment);
//                    break;
//
//                case 5:
//                    Appointment createAppointment = healthcareDemoOverSwitch.createAppointment();
//                    System.out.println("create appointment"+createAppointment);
//                    break;
//
//                case 6:
//                    Prescription createPrescription = healthcareDemoOverSwitch.createPrescription();
//                    System.out.println("create prescription"+createPrescription);
//                    break;
//
//                case 7:
//                    Billing createBilling = healthcareDemoOverSwitch.createBilling();
//                    System.out.println("create billing"+createBilling);
//                    break;
//
//                default:
//                    System.out.println("invalid option");
//                    break;

            }


        } while (option != 0);{
            System.out.println("thank you !!!");
        }

        for (int i=1;i<=10;i++){

            Person person1 = healthcareDemoOverArray.
        }




    }


}

