//package hw_28_03_18.Excel;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class ReadFile {
//    private int numberMainRow;
//
//    String file = "D:\\Java\\Project\\New folder\\TyresSumy.xls";
//    HSSFWorkbook excelBookFile = new HSSFWorkbook(new FileInputStream(file));
//    HSSFSheet excelSheet = excelBookFile.getSheet("Sheet1");
//
//    public ReadFile() throws IOException {
//        findMainRow();
//        HSSFRow rowMain = excelSheet.getRow(numberMainRow);
//        System.out.println(rowMain.getCell(0));
//    }
//
//    private void findMainRow() {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 20; j++) {
//                HSSFRow rowMain = excelSheet.getRow(i);
//                rowMain.getCell(j).getStringCellValue().toLowerCase();
//                if(rowMain.getCell(j).getCellType() == HSSFCell.CELL_TYPE_STRING) {
//                    if (rowMain.getCell(j).getStringCellValue().contains("код") && rowMain.getCell(j).getStringCellValue().contains("товар") && rowMain.getCell(j).getStringCellValue().contains("ціна")) {
//                        numberMainRow = numberMainRow;
//                        break;
//                    }
//                }
//            }
//        }
//    }
//
//
//}
