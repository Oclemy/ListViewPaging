package com.tutorials.hp.listviewpaging;

import java.util.ArrayList;

/**
 * Created by Oclemy on 2017 for ProgrammingWizards TV Channel and http://www.camposha.info.
  - Our Paginator class.
  - Will page our data.
 */

public class Paginator {

    public static final int TOTAL_NUM_ITEMS = DataHolder.getGalaxies().size();
    public static final int ITEMS_PER_PAGE = 5;

    /*
    - Our constructor class.
     */
    public Paginator() {
    }

    /*
    TOTAL NUMBER OF PAGES
     */
    public int getTotalPages() {
        int remainingItems=TOTAL_NUM_ITEMS % ITEMS_PER_PAGE;
        if(remainingItems>0)
        {
            return TOTAL_NUM_ITEMS / ITEMS_PER_PAGE;
        }
        return (TOTAL_NUM_ITEMS / ITEMS_PER_PAGE)-1;

    }

    /*
    CURRENT PAGE's GalaxieS LIST
     */
    public ArrayList<Galaxy> getCurrentGalaxys(int currentPage) {
        int startItem = currentPage * ITEMS_PER_PAGE;
        int lastItem = startItem + ITEMS_PER_PAGE;

        ArrayList<Galaxy> currentGalaxys = new ArrayList<>();

        //LOOP THRU LIST OF GALAXIES AND FILL CURRENTGALAXIES LIST
        try {
            for (int i = 0; i < DataHolder.getGalaxies().size(); i++) {

                //ADD CURRENT PAGE'S DATA
                if (i >= startItem && i < lastItem) {
                    currentGalaxys.add(DataHolder.getGalaxies().get(i));
                }
            }
            return currentGalaxys;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
