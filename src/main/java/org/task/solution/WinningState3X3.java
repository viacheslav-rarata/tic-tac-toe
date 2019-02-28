package org.task.solution;

class WinningState3X3 implements WinningState {

    private String[][] input;
    private static final int WINNING_SUM = 3;
    private static final String WINNING_ITEM = "X";

    public boolean isBoardInWinningState(String[][] input) {
        // store array to property for easy manipulation with data
        this.input = input;
        if (!isAllowedArray()) {
            throw new RuntimeException("Array have wrong size");
        }
        return isWinningState();
    }

    private boolean isAllowedArray() {
        if (isAllowedLength(input.length)) return false;
        for (String[] strings : input) {
            if (isAllowedLength(strings.length)) return false;
        }
        return true;
    }

    private boolean isAllowedLength(int length) {
        return WINNING_SUM != length;
    }

    private boolean isWinningItem(String item) {
        return WINNING_ITEM.equalsIgnoreCase(item);
    }

    private boolean isWinningState() {
        for (Winning3X3Item item : Winning3X3Item.values()) {
            if (isWinningItem(input[item.getPositionX()][item.getPositionY()]) && isWinningLineForItem(item)) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinningLineForItem(Winning3X3Item item) {
        switch (item) {
            case X00:
                if(isHorizontal(item) || isVertical(item) || isDiagonal(item)) return true;
                break;
            case X01:
                if(isVertical(item)) return true;
                break;
            case X02:
                if(isVertical(item) || isDiagonal(item)) return true;
                break;
            case X10:
            case X20:
                if(isHorizontal(item)) return true;
                break;
        }
        return false;
    }

    private boolean isHorizontal(Winning3X3Item item) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (isWinningItem(input[item.getPositionX()][i])) {
                count++;
            }
        }
        return isWinningResult(count);
    }

    private boolean isVertical(Winning3X3Item item) {
        int count = 0;
        for (int i = item.getPositionX(); i < input.length; i++) {
            if (isWinningItem(input[i][item.getPositionY()])) {
                count++;
            }
        }
        return isWinningResult(count);
    }

    private boolean isDiagonal(Winning3X3Item item) {
        int count = 0;
        if (item.getPositionY() == 0) {
            for (int i = 0; i < input.length; i++) {
                if (isWinningItem(input[i][i])) {
                    count++;
                }
            }
            return isWinningResult(count);
        } else {
            for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
                if (isWinningItem(input[j][i])) {
                    count++;
                }
            }
            return isWinningResult(count);
        }
    }

    private boolean isWinningResult(int count) {
        return WINNING_SUM == count;
    }

}
