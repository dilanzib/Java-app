package app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtils {
    static void readTextFile(String fileName) throws FileNotFoundException {
        try {
            Scanner inputStream = new Scanner(new File(fileName));
            var line = inputStream.nextLine();

            while (inputStream.hasNext()) {
                line = inputStream.nextLine();

                var regex = "(?!\\B\"[^\"]*),(?![^\"]*\"\\B)";
                String[] ary = line.split(regex);

                if (Utils.isName(ary[0])) { //find " Clarencé Andersson " name
                    String n;
                    n = ary[0].replaceAll("[\"]", ""); //removing quotation
                    ary[0] = n.replaceAll("[,]", " "); //replacing comma with space
                }

                if(Utils.isDot(ary[0])){ //find the dot
                    ary[0] = ary[0].replaceAll("[.]", ""); //removing the dot in the end of the file
                }

                String name = ary[0];
                if(ary.length > 1) {
                    double loan = Double.parseDouble(ary[1]);
                    double interest = Double.parseDouble(ary[2]);
                    int years = Integer.parseInt(ary[3]);

                    double b = (interest/100) / 12;
                    int c = years * 12;

                    Payment pay = new Payment(loan, b, c); //Calculating the monthly payment

                    System.out.printf("%s wants to borrow %.2f € for a period of %d years and pay %.2f € each month\n",
                            name,
                            loan,
                            years,
                            pay.m);
                }
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("No such file available.");
            throw new FileNotFoundException();
        }
    }

}
