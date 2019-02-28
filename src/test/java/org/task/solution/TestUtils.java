package org.task.solution;

class TestUtils {
    String[][] firstHorizontalLine = {
            {"X", "X", "X"},
            {"_", "_", "_"},
            {"_", "_", "_"}
    };
    String[][] secondHorizontalLine = {
            {"_", "_", "_"},
            {"X", "X", "X"},
            {"_", "_", "_"}
    };
    String[][] thirdHorizontalLine = {
            {"_", "_", "_"},
            {"_", "_", "_"},
            {"X", "X", "X"}
    };

    String[][] firstVerticalLine = {
            {"X", "_", "_"},
            {"X", "_", "_"},
            {"X", "_", "_"}
    };
    String[][] secondVerticalLine = {
            {"_", "X", "_"},
            {"_", "X", "_"},
            {"_", "X", "_"}
    };
    String[][] thirdVerticalLine = {
            {"_", "_", "X"},
            {"_", "_", "X"},
            {"_", "_", "X"}
    };
    String[][] firstDiagonalLine = {
            {"X", "_", "_"},
            {"_", "X", "_"},
            {"_", "_", "X"}
    };
    String[][] secondDiagonalLine = {
            {"_", "_", "X"},
            {"_", "X", "_"},
            {"X", "_", "_"}
    };
    String[][] noResults = {
            {"X", "_", "X"},
            {"X", "_", "_"},
            {"_", "X", "X"}
    };
    String[][] wrongArray = {
            {"_", "_", "X"},
            {"_", "X", "_"},
            {"X", "_"}
    };
}
