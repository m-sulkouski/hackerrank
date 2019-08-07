package hackerrank.m_sulkouski.github.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class Day10_BinaryNumbersTest {
    @Test
    public void testDecimalToBinaryConversion() {
        assertArrayEquals(new int[]{0,1}, Day10_BinaryNumbers.decimalToBinary(2));
        assertArrayEquals(new int[]{1,1}, Day10_BinaryNumbers.decimalToBinary(3));
        assertArrayEquals(new int[]{0,0,1}, Day10_BinaryNumbers.decimalToBinary(4));
        assertArrayEquals(new int[]{1,0,1}, Day10_BinaryNumbers.decimalToBinary(5));
        assertArrayEquals(new int[]{0,0,0,1}, Day10_BinaryNumbers.decimalToBinary(8));
        assertArrayEquals(new int[]{0,0,0,0,1}, Day10_BinaryNumbers.decimalToBinary(16));
    }
    @Test
    public void testLargestConsecutiveBits() {
        assertEquals(2,Day10_BinaryNumbers.countConsecutiveOneBits(new int[]{1,1}));
        assertEquals(3,Day10_BinaryNumbers.countConsecutiveOneBits(new int[]{1,1,0,0,0,1,1,1,0,0,1}));
        assertEquals(6,Day10_BinaryNumbers.countConsecutiveOneBits(new int[]{1,1,0,0,0,1,1,1,1,1,1}));
    }

}