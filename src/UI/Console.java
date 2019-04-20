package UI;

import Domain.Car;
import Domain.Rental;
import Service.CarService;
import Service.ReantalService;
import Service.TransactionService;

import java.util.Scanner;

public class Console {

    private CarService carService;
    private ReantalService rentalService;
    private TransactionService transactionService;

    private Scanner scanner;

    public Console(CarService carService, ReantalService rentalService, TransactionService transactionService) {
        this.carService = carService;
        this.rentalService = rentalService;
        this.transactionService = transactionService;

        this.scanner = new Scanner(System.in);
    }

    private void showMenu() {
        System.out.println("1. Car CRUD");
        System.out.println("2. Rent CRUD");
        System.out.println("3. Transaction CRUD");
        System.out.println("x. Exit");
    }

    public void run() {
        while (true) {
            showMenu();

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    runCakeCrud();
                    break;
                case "2":
                    runClientCrud();
                    break;
                case "3":
                    runTransactionCrud();
                    break;
                case "x":
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private void runTransactionCrud() {
        while (true) {
            System.out.println("1. Add or update a rental");
            System.out.println("2. Remove a transaction");
            System.out.println("3. View all transactions");
            System.out.println("4. Back");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    handleAddUpdateTransaction();
                    break;
                case "2":
                    handleRemoveTransaction();
                    break;
                case "3":
                    handleViewTransactions();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private void handleViewTransactions() {
        for (Rental transaction : transactionService.getAll()) {
            System.out.println(transaction);
        }
    }

    private void handleRemoveTransaction() {
        try {
            System.out.print("Enter the id to remove:");
            String id = scanner.nextLine();
            transactionService.remove(id);

            System.out.println("Transaction removed!");
        } catch (Exception ex) {
            System.out.println("Errors:\n" + ex.getMessage());
        }
    }

    private void handleAddUpdateTransaction() {
        try {
            System.out.print("Enter id: ");
            String id = scanner.nextLine();
            System.out.print("Enter car model (empty to not change for update): ");
            String model = scanner.nextLine();
            System.out.print("Enter number of kilometri: ");
            int kilometraj = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter number of kilometri: ");
            int kilometraj = Integer.parseInt(scanner.nextLine());



