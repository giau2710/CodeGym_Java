package classify_triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class Testtamgiac {
    @Test
    @DisplayName("Testing1")
    public void testtamgiacdeu() {
        double a = 3;
        double b = 3;
        double c = 3;
        String expected = "Tam giac Deu";
        String result = TamGiac.checkTamgGiac(a, b, c);
        assertEquals(expected, result);
    }




    @Test
    @DisplayName("Testing add 0 + 0")
    public void testtamgiaccan() {
        double a = 4;
        double b = 4;
        double c = 7;
        String expected = "Tam giac Can";
        String result = TamGiac.checkTamgGiac(a, b, c);
        assertEquals(expected, result);

    }


    @Test
    @DisplayName("Testing2")
    public void testtamgiacthuong() {
        double a = 3;
        double b = 4;
        double c = 5;
        String expected = "Tam giac thuong";
        String result = TamGiac.checkTamgGiac(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 3")
    public void testtamgiacfaid() {
        double a = 3;
        double b = 3;
        double c = 7;
        String expected = "Khong phai tam giac";
        String result =TamGiac.checkTamgGiac(a, b, c);
        assertEquals(expected, result);
    }
}

