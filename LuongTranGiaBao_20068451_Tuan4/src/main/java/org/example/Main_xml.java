package org.example;

import jdepend.xmlui.JDepend;

import java.io.PrintWriter;
import jdepend.xmlui.JDepend;
public class Main_xml {
    public static void main(String[] args) throws  Exception {
        JDepend depend =new JDepend(new PrintWriter("report/Report.xml"));
        depend.addDirectory("T:\\Tuan4\\Library-Assistant-master\\Library-Assistant-master");
        depend.analyze();
        System.out.println("DONE");
    }
    }

