package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
@author   Oleksandra Hrytsiuk
@project   L1
@enum  RomanNumeral
@version  1.0.0
@since 22.08.2024 - 12.18
*/

//At the end of the code is a list of numbers and when they were added

public class ConverterTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNumberIsLessThan_0ThenReturnException(){
        Converter.arabicToRoman(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenNumberIsGraterThan_4000ThenReturnException(){
        Converter.arabicToRoman(4001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenNumberIs_0ThenReturnException(){
        Converter.arabicToRoman(0);
    }

    //I arranged all the numbers in ascending order for convenience

    @Test
    public void whenNumberIs_3ThenReturn_III(){
        assertEquals("III",Converter.arabicToRoman(3));
    }
    @Test
    public void whenNumberIs_4ThenReturn_IV(){
        assertEquals("IV",Converter.arabicToRoman(4));
    }
    @Test
    public void whenNumberIs_5ThenReturn_V(){
        assertEquals("V",Converter.arabicToRoman(5));
    }
    @Test
    public void whenNumberIs_8ThenReturn_VIII(){
        assertEquals("VIII",Converter.arabicToRoman(8));
    }
    @Test
    public void whenNumberIs_9ThenReturn_IX(){
        assertEquals("IX",Converter.arabicToRoman(9));
    }
    @Test
    public void whenNumberIs_10ThenReturn_X(){
        assertEquals("X",Converter.arabicToRoman(10));
    }
    @Test
    public void whenNumberIs_11ThenReturn_XI(){
        assertEquals("XI",Converter.arabicToRoman(11));
    }
    @Test
    public void whenNumberIs_20ThenReturn_XX(){
        assertEquals("XX",Converter.arabicToRoman(20));
    }
    @Test
    public void whenNumberIs_40ThenReturn_XL(){
        assertEquals("XL",Converter.arabicToRoman(40));
    }
    @Test
    public void whenNumberIs_47ThenReturn_XLVII() {
        assertEquals("XLVII", Converter.arabicToRoman(47));
    }
    @Test
    public void whenNumberIs_50ThenReturn_L(){
        assertEquals("L",Converter.arabicToRoman(50));
    }
    @Test
    public void whenNumberIs_57ThenReturn_LVII() {
        assertEquals("LVII", Converter.arabicToRoman(57));
    }
    @Test
    public void whenNumberIs_90ThenReturn_XC() {
        assertEquals("XC", Converter.arabicToRoman(90));
    }
    @Test
    public void whenNumberIs_93ThenReturn_XCIII() {
        assertEquals("XCIII", Converter.arabicToRoman(93));
    }
    @Test
    public void whenNumberIs_100ThenReturn_C() {
        assertEquals("C", Converter.arabicToRoman(100));
    }
    @Test
    public void whenNumberIs_103ThenReturn_CIII() {
        assertEquals("CIII", Converter.arabicToRoman(103));
    }
    @Test
    public void whenNumberIs_110ThenReturn_CX() {
        assertEquals("CX", Converter.arabicToRoman(110));
    }
    @Test
    public void whenNumberIs_113ThenReturn_CXIII() {
        assertEquals("CXIII", Converter.arabicToRoman(113));
    }
    @Test
    public void whenNumberIs_140ThenReturn_CXL() {
        assertEquals("CXL", Converter.arabicToRoman(140));
    }
    @Test
    public void whenNumberIs_190ThenReturn_CXC() {
        assertEquals("CXC", Converter.arabicToRoman(190));
    }
    @Test
    public void whenNumberIs_200ThenReturn_CC() {
        assertEquals("CC", Converter.arabicToRoman(200));
    }
    @Test
    public void whenNumberIs_400ThenReturn_CD() {
        assertEquals("CD", Converter.arabicToRoman(400));
    }
    @Test
    public void whenNumberIs_403ThenReturn_CDIII() {
        assertEquals("CDIII", Converter.arabicToRoman(403));
    }
    @Test
    public void whenNumberIs_410ThenReturn_CDX() {
        assertEquals("CDX", Converter.arabicToRoman(410));
    }
    @Test
    public void whenNumberIs_414ThenReturn_CDXIV() {
        assertEquals("CDXIV", Converter.arabicToRoman(414));
    }
    @Test
    public void whenNumberIs_440ThenReturn_CDXL() {
        assertEquals("CDXL", Converter.arabicToRoman(440));
    }
    @Test
    public void whenNumberIs_444ThenReturn_CDXLIV() {
        assertEquals("CDXLIV", Converter.arabicToRoman(444));
    }
    @Test
    public void whenNumberIs_490ThenReturn_CDXC() {
        assertEquals("CDXC", Converter.arabicToRoman(490));
    }
    @Test
    public void whenNumberIs_500ThenReturn_D() {
        assertEquals("D", Converter.arabicToRoman(500));
    }
    @Test
    public void whenNumberIs_506ThenReturn_DVI() {
        assertEquals("DVI", Converter.arabicToRoman(506));
    }
    @Test
    public void whenNumberIs_510ThenReturn_DX() {
        assertEquals("DX", Converter.arabicToRoman(510));
    }
    @Test
    public void whenNumberIs_515ThenReturn_DXV() {
        assertEquals("DXV", Converter.arabicToRoman(515));
    }
    @Test
    public void whenNumberIs_540ThenReturn_DXL() {
        assertEquals("DXL", Converter.arabicToRoman(540));
    }
    @Test
    public void whenNumberIs_590ThenReturn_DXC() {
        assertEquals("DXC", Converter.arabicToRoman(590));
    }
    @Test
    public void whenNumberIs_900ThenReturn_CM() {
        assertEquals("CM", Converter.arabicToRoman(900));
    }
    @Test
    public void whenNumberIs_906ThenReturn_CMV() {
        assertEquals("CMVI", Converter.arabicToRoman(906));
    }
    @Test
    public void whenNumberIs_910ThenReturn_CMX() {
        assertEquals("CMX", Converter.arabicToRoman(910));
    }
    @Test
    public void whenNumberIs_913ThenReturn_CMXIII() {
        assertEquals("CMXIII", Converter.arabicToRoman(913));
    }
    @Test
    public void whenNumberIs_940ThenReturn_CMXL() {
        assertEquals("CMXL", Converter.arabicToRoman(940));
    }
    @Test
    public void whenNumberIs_990ThenReturn_CMXC() {
        assertEquals("CMXC", Converter.arabicToRoman(990));
    }
    @Test
    public void whenNumberIs_999ThenReturn_CMXCIX() {
        assertEquals("CMXCIX", Converter.arabicToRoman(999));
    }
    @Test
    public void whenNumberIs_1000ThenReturn_M() {
        assertEquals("M", Converter.arabicToRoman(1000));
    }
    @Test
    public void whenNumberIs_1008ThenReturn_MVIII() {
        assertEquals("MVIII", Converter.arabicToRoman(1008));
    }
    @Test
    public void whenNumberIs_1010ThenReturn_MX() {
        assertEquals("MX", Converter.arabicToRoman(1010));
    }
    @Test
    public void whenNumberIs_1014ThenReturn_MXIV() {
        assertEquals("MXIV", Converter.arabicToRoman(1014));
    }
    @Test
    public void whenNumberIs_1040ThenReturn_MXL() {
        assertEquals("MXL", Converter.arabicToRoman(1040));
    }
    @Test
    public void whenNumberIs_1090ThenReturn_MXC() {
        assertEquals("MXC", Converter.arabicToRoman(1090));
    }
    @Test
    public void whenNumberIs_1100ThenReturn_MC() {
        assertEquals("MC", Converter.arabicToRoman(1100));
    }
    @Test
    public void whenNumberIs_1111ThenReturn_MCXI() {
        assertEquals("MCXI", Converter.arabicToRoman(1111));
    }
    @Test
    public void whenNumberIs_1400ThenReturn_MCD() {
        assertEquals("MCD", Converter.arabicToRoman(1400));
    }
    @Test
    public void whenNumberIs_1900ThenReturn_MCM() {
        assertEquals("MCM", Converter.arabicToRoman(1900));
    }
    @Test
    public void whenNumberIs_2000ThenReturn_MM() {
        assertEquals("MM", Converter.arabicToRoman(2000));
    }
    @Test
    public void whenNumberIs_3000ThenReturn_MMM() {
        assertEquals("MMM", Converter.arabicToRoman(3000));
    }
    @Test
    public void whenNumberIs_3999ThenReturn_MMMCMXCIX() {
        assertEquals("MMMCMXCIX", Converter.arabicToRoman(3999));
    }
    @Test
    public void whenNumberIs_4000ThenReturn_MMMM() {
        assertEquals("MMMM", Converter.arabicToRoman(4000));
    }

    //Interesting big numbers

    @Test
    public void whenNumberIs_1666ThenReturn_MDCLXVI() {
        assertEquals("MDCLXVI", Converter.arabicToRoman(1666));
    }

    @Test
    public void whenNumberIs_3333ThenReturn_MMMCCCXXXIII() {
        assertEquals("MMMCCCXXXIII", Converter.arabicToRoman(3333));
    }

    @Test
    public void whenNumberIs_494ThenReturn_CDXCIV() {
        assertEquals("CDXCIV", Converter.arabicToRoman(494));
    }

    @Test
    public void whenNumberIs_2579ThenReturn_MMDLXXIX() {
        assertEquals("MMDLXXIX", Converter.arabicToRoman(2579));
    }

    @Test
    public void whenNumberIs_1562ThenReturn_MDLXII() {
        assertEquals("MDLXII", Converter.arabicToRoman(1562));
    }
}
//At initial creation
//-1,0,4001,3,4,5,8,9,10,11,20,40,50,90,100,200,400,444,500,900,999,1000,2000,3000,3999,4000

//Added after consultation (mainly focused on tens and hundreds)
//110,113,140,190,410,414,440,490,510,
//515,540,590,910,913,940,990,1010,1014,
//1040,1090,1100,1111,1400,1900

//Not sure (with reasons)

//57 that checks the combination of digits to L
//103 that checks the combination of digits to С
//506 that checks the combination of digits to D
//1008 that checks the combination of digits to M

//47 that checks the combination of digits to XL
//93 that checks the combination of digits to XC
//403 that checks the combination of digits to CD
//906 that checks the combination of digits to CM

//1666 is a number that includes all symbols (MDCLXVI)
//3333 is a number "MMMCCCXXXIII" checking for repetitions of M, C and X and I
//494 is a number that is a combination of 4 and 9 (difficult numbers)
//2579 combination with two thousand
//1562 combination with a thousand