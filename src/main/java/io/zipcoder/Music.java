package io.zipcoder;

import java.util.Arrays;
import java.util.List;

public class Music {



    private final String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection( Integer startIndex, String selection) {
        List<String> musicList = Arrays.asList(playList);
        
        int result = 0;

        int leftMove = 1;
        int leftMoveIndex = startIndex+1;
        int rightMove = 1;
        int rightMoveIndex = startIndex-1;
        int numberOfElements = musicList.size();

        while (numberOfElements > 0) {

            if (leftMoveIndex > musicList.size() - 1) {
                leftMoveIndex = (leftMoveIndex+1) % musicList.size();

            }

            if (rightMoveIndex <= -1) {
                rightMoveIndex = musicList.size() - 1;
            }

            if (musicList.get(leftMoveIndex).equals(selection)) {
                if (leftMove <= rightMove) {
                    result = leftMove;
                    break;
                }
            }
            else {
                leftMove++;
                leftMoveIndex++;
            }

            if (musicList.get(rightMoveIndex).equals(selection)) {
                if (rightMove <= leftMove) {
                    result = rightMove;
                    break;
                }
            }
            else {
                rightMove++;
                rightMoveIndex--;
            }

            numberOfElements--;
        }

   return  result;
    }


}
