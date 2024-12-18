package com.healthcaremanagemntsystem.service;

import com.healthcaremanagemntsystem.model.Doctor;
import com.healthcaremanagemntsystem.model.Hospital;
import com.healthcaremanagemntsystem.model.Person;

import java.util.Scanner;

public class HealthcareDemoOverSwitch {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HealthcareDemoOverSwitch healthcareDemoOverSwitch = new HealthcareDemoOverSwitch();


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
                    Person createPerson =healthcareDemoOverSwitch.createPerson();
                    System.out.println("create person" + createPerson);
                    break;

                case 2:
                    Hospital createHospital = healthcareDemoOverSwitch.createHospital();
                    System.out.println("create hospital"+createHospital);
                    break;

                case 3:
                    System.out.println("create doctor");
                    break;
            }


        } while (option != 0);{
            System.out.println("thank you !!!");
        }
    }

    private Person createPerson(){

        System.out.println("please enter id ");
        int id=Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type");
        String type = scanner.nextLine();

        System.out.println("please enter fName");
        String fName = scanner.nextLine();

        System.out.println("please enter lName");
        String lName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter mobile number");
        String mobile = scanner.nextLine();

        System.out.println("please enter alternate number");
        String alternateMobile =  scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person person = new Person();
        person.setId(id);
        person.setType(type);
        person.setfName(fName);
        person.setlName(lName);
        person.setAge(age);
        person.setGender(gender);
        person.setMobile(mobile);
        person.setAlternateMobile(alternateMobile);
        person.setAddress(address);
        return person;

        }

        private Hospital createHospital(){

            System.out.println("please enter hospital id");
            int hospitalId= Integer.parseInt(scanner.nextLine());

            System.out.println("enter hospital name");
            String hName = scanner.nextLine();

            System.out.println("enter contact number");
            String contactNo = scanner.nextLine();

            System.out.println("enter hospital address");
            String hAddress = scanner.nextLine();

            System.out.println("enter email id");
            String emailId = scanner.nextLine();

            Hospital hospital = new Hospital();
            hospital.setHospitalId(hospitalId);
            hospital.sethName(hName);
            hospital.setContactNo(contactNo);
            hospital.sethAddress(hAddress);
            hospital.setEmailId(emailId);
            return hospital;
        }

        private void createDoctor(){

            System.out.println("enter doctor id");
            int doctorId = Integer.parseInt(scanner.nextLine());

            System.out.println("enter first name");
            String fname = scanner.nextLine();

            System.out.println("enter last name");
            String lname = scanner.nextLine();



            Doctor doctor = new Doctor();
            doctor.setDoctorId(doctorId);
            doctor.setfName(fname);
            doctor.setlName(lname);
            
        }
    }

