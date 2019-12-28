package com.company;

public class Report {

    private IReportFormat reportFormat;

    public Report(IReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public void display() {
        reportFormat.generate();
    }

}
