package com.company;

public class SalesReport extends Report {

    public SalesReport(IReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display() {
        System.out.println("Sales Report Display");
        super.display();
    }
}
