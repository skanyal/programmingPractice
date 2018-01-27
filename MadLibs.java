package code.daybyday.test;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by swetakanyal on 1/7/18.
 */
public class MadLibs {

    Scanner sc = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNumber;
    Random ran = new Random(); //primitive datatype

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public String getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void setRandomNumber() {
        int num = Math.abs(ran.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while (index < numberHolder.length){
            numberHolder[index] = num + index;
        index++;
    }
    randomNumber = "not " +numberHolder[0]+ "not " +numberHolder[1]+ ", but " + numberHolder[2];
    }



    public void printInstrusctions(){
        System.out.println("Welcome to the madlibs!!");
    }

    //get data from player
    public void enterName(){
        System.out.println("Give me name");
        setName(sc.nextLine());
    }

    public void enterNoun1(){
        System.out.println("Give me noun1");
        setNoun1(sc.nextLine());
    }

    public void enterNoun2(){
        System.out.println("Give me noun2");
        setNoun2(sc.nextLine());
    }

    public void enterNoun3(){
        System.out.println("Give me noun3");
        setNoun3(sc.nextLine());
    }

    public void enterAdjective1(){
        System.out.println("Give me adjective");
        setAdjective1(sc.nextLine());
    }

    public void enterAdverb(){
        System.out.println("I really want an adverb!!");
        setAdverb(sc.nextLine());
    }


    public void putTogetherTheStory(){
        String story;
        int num = Math.abs(ran.nextInt()) % 2;
        if(num==0){
         story = "Jess and her bes bfried" +getName()+ "went to disney world"
                + "they saw a" +getNoun1()+ "in the show at the magic kingdom"  +getAdjective1() +getAdverb() +getRandomNumber();
    } else {
            story = "Jess and her bes bfried" +getName()+ "went to disney world"
                    + "they saw a" +getNoun1()+ "in the show at the magic kingdom"  +getAdjective1() +getAdverb() +getRandomNumber();

        }
        setName(story);

        }

    public void play(){
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdjective1();
        setRandomNumber();
        putTogetherTheStory();
        System.out.println(getStory());
    }

    public static void main(String[] args){
        MadLibs mad = new MadLibs();
        mad.printInstrusctions();
        mad.play();

    }

}
