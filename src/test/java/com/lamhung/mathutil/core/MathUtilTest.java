/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lamhung.mathutil.core;

import static com.lamhung.mathutil.core.MathUltil.*;
//import static là dành riêng cho nhung ham static 
//goi ham ma bo qua ten class
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author LamHung
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }
    
    
    
    //chuan bi bo data
    @Test
    public static Object[][] initData() {
        return new Integer[][] {
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {5, 120},
                                {6, 720}
                                };
    }
   
   
    @ParameterizedTest
    @MethodSource(value = "initData") //ten ham cung cap data, ngam dinh thu tu
    //cua cac phan tu mang , mao vao tham so ham
    public void testGetFactorialGivenRightArgReturnWell (int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
//    @Test
//    public void testGetFactorialGivenRightArgReturnWell () {
//        assertEquals(24, getFactorial(4));
//    }
    
    //bat ngoai le khi dua data ca chon vào!!!
    //@Test(expected = tên ngo?i le.cclass) JUnit hoy,Junit hok xài v?y!!!!
    
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        //hàm nh?n tham s? thu 2 la 1 cai object/ có code implement cái
        //fucntional interface tên là Excutable- có 1 hàm duy nh?t ko code 
        // tên là execute()
        //choi châm
//        Executable excOject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
                
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
    
}
