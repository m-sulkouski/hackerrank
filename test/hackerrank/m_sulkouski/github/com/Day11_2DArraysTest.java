package hackerrank.m_sulkouski.github.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day11_2DArraysTest {

    @Test
    void calculateHourGlassFromArrayTest() {
//        assertEquals(19,Day11_2DArrays.calculateHourGlassFromArray(new int[][]{{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}}));
        assertEquals(-6,Day11_2DArrays.calculateHourGlassFromArray(new int[][]{{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-4},{-1,-9,-2,-4,-4,-5},{-7,-3,-3,-9,-9,-9},{-1,-3,-1,-2,-4,-5}}));
    }
}