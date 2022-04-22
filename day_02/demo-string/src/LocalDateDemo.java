import javax.lang.model.element.NestingKind;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();

        System.out.println(ld);

        // chỉ định ngày tháng năm

        LocalDate ld1 = LocalDate.of(2022, 9, 21);

        System.out.println(ld1);

        // lấy năm tháng hiện tại
        System.out.println("Năm hiện tại :" + ld.getYear());
        System.out.println("Tháng hiện tại :" + ld.getMonth().getValue());

        //Thay đổi thời gian
        System.out.println(ld.plusYears(2));
        System.out.println(ld.minusMonths(3));

        System.out.println(ld.getYear() + " có là năm nhuận không " + ld.isLeapYear());
        System.out.println(ld.plusYears(2).getYear() + " có là năm nhuận không " + ld.plusYears(2).isLeapYear());

        //so sánh
        System.out.println(ld.equals(ld1));
        System.out.println(ld.isBefore(ld1));
        System.out.println(ld.isAfter(ld1));

        //format định dạng

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String strDate = ld.format(formatter);

        System.out.println(strDate);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        String strDate1 = ld.format(formatter1);

        System.out.println(strDate1);
    }
}
