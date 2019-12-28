package com.company;

public class EmployeePerformanceReport extends Report {
    public EmployeePerformanceReport(IReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display() {
        System.out.println("Employee Performance Report Display");
        super.display();
    }
}
