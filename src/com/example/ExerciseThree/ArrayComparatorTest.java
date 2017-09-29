package com.example.ExerciseThree;

public class ArrayComparatorTest {
    public static void main(String[] args) {
//        Should be false
//        boolean[][] arrayOne = {{false, true, true, false}, {true, false, true, false}, {false, false, false, false}};
//        boolean[][] arrayTwo = {{false, true, true, false}, {true, false, true, false}, {false, false, false, true}};

//        Should be true
        boolean[][] arrayOne = {{false, true, true, false}, {true, false, true, false}, {false, false, false, false}};
        boolean[][] arrayTwo = {{false, true, true, false}, {true, false, true, false}, {false, false, false, false}};

//        Should be false
//        boolean[][] arrayOne = {{false, true, true, false}, {true, false, true, false}, {false, false, false, false}};
//        boolean[][] arrayTwo = {{false, true, true, false}, {true, false, true, false}};

//        Should be false
//        boolean[][] arrayOne = {{false, true, true, false, true}, {true, false, true, false, false}, {false, false, false, false, true}};
//        boolean[][] arrayTwo = {{false, true, true, false}, {true, false, true, false}, {false, false, false, false}};

        System.out.println(ArrayComparator.compare(arrayOne, arrayTwo));
    }
}
