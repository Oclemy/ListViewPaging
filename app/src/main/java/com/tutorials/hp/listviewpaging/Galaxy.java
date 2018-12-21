package com.tutorials.hp.listviewpaging;

/**
 * Created by Oclemy on 2017 for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our Galaxy class.
 - Is our data object.
 - Each galaxy has a name,description,image and category.
 */

public class Galaxy {

    private String name,description,category;
    private int image;
    /*
    - Our constructor.
     */
    public Galaxy(String name, String description, int image,String category) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.category=category;
    }
    /*
    - Our getters and setters.
     */
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getImage() {
        return image;
    }
    public String getCategory() {
        return category;
    }
}
