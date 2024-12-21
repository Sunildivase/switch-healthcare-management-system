package com.healthcaremanagemntsystem.service;

import com.healthcaremanagemntsystem.model.*;

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
                    Doctor createDoctor = healthcareDemoOverSwitch.createDoctor();
                    System.out.println("create doctor"+createDoctor);
                    break;

                case 4:
                    Department createDepartment = healthcareDemoOverSwitch.createDepartment();
                    System.out.println("create department"+createDepartment);
                    break;

                case 5:
                    Appointment createAppointment = healthcareDemoOverSwitch.createAppointment();
                    System.out.println("create appointment"+createAppointment);
                    break;

                case 6:
                    Prescription createPrescription = healthcareDemoOverSwitch.createPrescription();
                    System.out.println("create prescription"+createPrescription);
                    break;

                case 7:
                    Billing createBilling = healthcareDemoOverSwitch.createBilling();
                    System.out.println("create billing"+createBilling);
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

        private Doctor createDoctor(){

            System.out.println("enter doctor id");
            int doctorId = Integer.parseInt(scanner.nextLine());

            System.out.println("enter first name");
            String fName = scanner.nextLine();

            System.out.println("enter last name");
            String lName = scanner.nextLine();

            System.out.println("please enter gender");
            String gender = scanner.nextLine();

            System.out.println("please enter age");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter contact number");
            String contactNo = scanner.nextLine();

            System.out.println("please enter speciality");
            String speciality = scanner.nextLine();


            Doctor doctor = new Doctor();
            doctor.setDoctorId(doctorId);
            doctor.setfName(fName);
            doctor.setlName(lName);
            doctor.setGender(gender);
            doctor.setAge(age);
            doctor.setContactNo(contactNo);
            doctor.setSpeciality(speciality);
            return doctor;

        }

        private Department createDepartment(){

            System.out.println("please enter department id");
            int deptId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter department name");
            String deptName = scanner.nextLine();

            System.out.println("please enter doctor id");
            int doctorId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter hospital id");
            int hospitalId = Integer.parseInt(scanner.nextLine());

            Department department = new Department();
            department.setDeptId(deptId);
            department.setDepName(deptName);
            department.setDoctorId(doctorId);
            department.setHospitalId(hospitalId);
            return department;
        }

        private Appointment createAppointment(){

            System.out.println("please enter appointment id");
            int appointmentId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter patient id");
            int patientId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter doctor id");
            int doctorId =Integer.parseInt(scanner.nextLine());

            System.out.println("please enter hospital id");
            int hospitalId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter department id");
            int deptId = Integer.parseInt(scanner.nextLine());

            Appointment appointment = new Appointment();
            appointment.setAppointmentId(appointmentId);
            appointment.setPatientId(patientId);
            appointment.setDoctorId(doctorId);
            appointment.setHospitalId(hospitalId);
            appointment.setDeptId(deptId);
            return appointment;
        }

        private Prescription createPrescription(){

            System.out.println("please enter prescription id");
            int pId= Integer.parseInt(scanner.nextLine());

            System.out.println("please enter patient id");
            int patientId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter prescription details");
            String prescriptionDetail= scanner.nextLine();

            Prescription prescription =new Prescription();
            prescription.setpId(pId);
            prescription.setPatientId(patientId);
            prescription.setPrescriptionDetail(prescriptionDetail);
            return prescription;
        }

        private Billing createBilling(){

            System.out.println("please enter billing id");
            int bId= Integer.parseInt(scanner.nextLine());

            System.out.println("please enter patient id");
            int patientId = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter bill");
            int bill = Integer.parseInt(scanner.nextLine());

            System.out.println("please enter total bill");
            int totalBill =Integer.parseInt(scanner.nextLine());

            Billing billing = new Billing();
            billing.setbId(bId);
            billing.setPatientId(patientId);
            billing.setBill(bill);
            billing.setTotalBill(totalBill);
            return billing;

        }
    }

