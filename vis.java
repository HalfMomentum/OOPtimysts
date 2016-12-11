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
public class vis 
{

private String vname=new String();           //user inputs name
private int age;                //age of the person booking the tour
private int vid;                //assigned visitor id
private int not;                //number of tourists
private String tps=new String();             //type of tour package selected
public int cot;                 //cost of tour

vis()                           //constructor to manage id allotment
{
    vid=0;
            Random randGen;
            randGen = new Random();
    vid = Math.abs(randGen.nextInt());  //random vid generated
  
}

public int getcot()
{
    return cot;
}
public int getnot()
{
    return not;
}
public int getvid()
{
    return vid;
}
public String getname()
{
    return vname;
}
public String gettps()
{
    return tps;
}
public int getage()
{
    return age;
}
public void settps(String n)
{
    tps=n;
}
public void setnot(int n)
{
    not=n;
}
public void setname(String n1)
{
    vname=n1;
}

public void setage(int n)
{
    age=n;
}
}
