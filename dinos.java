/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jura;

import java.util.Random;

/**
 *
 * @author dell
 */
public class dinos 
{
    private String name;
    private String age;
    public String diet;
    public String height;
    public String weight;
    private static int did;
   
    dinos()
            {
            did=0;
            Random randGen;
            randGen = new Random();
            did = Math.abs(randGen.nextInt());
            
            }
    int givedid()
    {
        return did;
    }
    
    void getname(String n)
    {
        this.name=n;
    }
    String givename()
    {
        return name;
    }
    
    void getage(String n)
    {
        this.age=n;
    }
    String giveage()
    {
        return age;
    }
    
    void getheight(String n)
    {
        this.height=n;
    }
    String giveheight()
    {
        return height;
    }
    
    void getweight(String n)
    {
        this.weight=n;
    }
    String giveweight()
    {
        return weight;
    }
    
    void getdiet(String n)
    {
        this.diet=n;
    }
    String givediet()
    {
        return diet;
    }
   
}
