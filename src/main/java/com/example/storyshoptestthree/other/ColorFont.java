package com.example.storyshoptestthree.other;

public class ColorFont {
    private String text;

    public String redFont(String text){
        return (char)27+"[01;31m"+text;
    }

    public String greenFont(String text){
        return (char)27+"[01;32m"+text;
    }
    public String yellowFont(String text){
        return (char)27+"[01;33m"+text;
    }
    public String violetFont(String text){
        return (char)27+"[01;34m"+text;
    }
    public String pinkFont(String text){
        return (char)27+"[01;35m"+text;
    }
    public String turquoiseFont(String text){
        return (char)27+"[01;36m"+text;
    }
    public String greyFont(String text){
        return (char)27+"[01;37m"+text;
    }

    public ColorFont() {
    }

    public ColorFont(String text) {
        this.text = (char)27+"[38m"+text;
    }
    /*
изменить цвета смотри -> in internet - ANSI escape codes


    String text = "redFont";

    text = new ColorFont().redFont(text);
        System.out.println(text);

    text = "yellowFont";
    text = new ColorFont().yellowFont(text);
        System.out.println(text);

    text = "violetFont";
    text = new ColorFont().violetFont(text);
        System.out.println(text);

    text = "pinkFont";
    text = new ColorFont().pinkFont(text);
        System.out.println(text);

    text = "turquoiseFont";
    text = new ColorFont().turquoiseFont(text);
        System.out.println(text);

    text = "greyFont";
    text = new ColorFont().greyFont(text);
        System.out.println(text);

    text = "greenFont";
    text = new ColorFont().greenFont(text);
        System.out.println(text);

*/


}
