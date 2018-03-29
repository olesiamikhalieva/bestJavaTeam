package ht20_27_03_18;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.Date;
import java.util.Iterator;

public class ExcellRunner {
    public static void main(String[] args) throws IOException {
        readFromExcel("C:\\Users\\druzhchenkotyu\\Downloads\\TyresSumy.xls");
    }
    public static void readFromExcel(String file) throws IOException {
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
        HSSFSheet myExcelSheet = myExcelBook.getSheet("TDSheet");
        HSSFRow rowH = myExcelSheet.getRow(6);

        if(rowH.getCell(1).getCellType() == HSSFCell.CELL_TYPE_STRING){
            System.out.print(rowH.getCell(1).getStringCellValue() + "\t\t\t");
        }

        if(rowH.getCell(2).getCellType() == HSSFCell.CELL_TYPE_STRING){
            System.out.print(rowH.getCell(2).getStringCellValue()+"\t\t\t");
        }

        if(rowH.getCell(8).getCellType() == HSSFCell.CELL_TYPE_STRING){
            System.out.println(rowH.getCell(8).getStringCellValue());
        }

        Iterator<Row> rows = myExcelSheet.rowIterator(); // Перебираем все строки

        // Пропускаем "шапку" таблицы
        if (rows.hasNext()) {
            rows.next();
            rows.next();
            rows.next();
            rows.next();
            rows.next();
            rows.next();
            rows.next();
        }

        // Перебираем все строки начиная со второй до тех пор, пока документ не закончится
        while (rows.hasNext()) {
            HSSFRow row = (HSSFRow) rows.next();
            //Получаем ячейки из строки по номерам столбцов
            HSSFCell shCell = row.getCell(1); //ФИО
            HSSFCell pCell = row.getCell(2); //Адрес
            HSSFCell nameCell = row.getCell(8); //Номер телефона
            // Если в первом столбце нет данных, то контакт не создаём
            if (shCell != null) {
                System.out.print(shCell.getNumericCellValue() + "\t\t");
            }
            if (pCell != null){
                System.out.print(pCell.getNumericCellValue()+"\t\t");
            }
            if (nameCell != null) {
                System.out.println(nameCell.getStringCellValue());
            }

        }

        myExcelBook.close();

    }
}
