package org.example;


//import jdepend.xmlui.JDepend;
import jdepend.swingui.JDepend;
import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend();
        depend.addDirectory("T:\\Tuan4\\Library-Assistant-master\\Library-Assistant-master");
        depend.analyze();
        System.out.println("DONE");
    }
        }

