package io.zipcoder;

public class Music {



    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection( Integer startIndex, String selection) {
        Integer forward = 0;
        Integer backward = 0;
        Integer minButtonPresses = 0;
        for (int i = startIndex; i < getPlayList().length; i++) { //will stop adding to counter when found
            if (!selection.equals(getPlayList()[i])) {
                forward++;
            }
        }
        for (int j = startIndex ; j >= 0; j--) {
            if (!selection.equals(getPlayList()[j])) { // will stop adding to counter when string found
                backward++;
            }
        }

        if (forward < backward) {
            minButtonPresses = forward;

        } else if (forward == backward) {

            minButtonPresses = forward;

        } else {
            minButtonPresses = backward;

        }


        return minButtonPresses;


  }



    public String[] getPlayList() {
        return playList;
    }
}
