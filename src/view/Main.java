package view;

import view.view.MainWindow;


public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        com.company.model.functions.AFunction first = new com.company.model.functions.AFunction(10,-10, 2);
        window.chartField.addChart(
                "x-3", first.getXes(),
                first.getYes());
        window.run();
    }
}
