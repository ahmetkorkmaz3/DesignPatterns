package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Report Nesnesi 1");
        Report report = new EmployeePerformanceReport(new DesktopFormat());
        report.display();

        System.out.println();
        System.out.println();

        System.out.println("Report Nesnesi 2");
        Report report2 = new SalesReport(new WebFormat());
        report2.display();

    }
}
