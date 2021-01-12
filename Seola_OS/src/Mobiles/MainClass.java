/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobiles;
import Amazon.checkout;
import Amazon.home;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Srinivas
 */
    public class MainClass {
    public int tcost;
    public int ttcost;
    public List<String> p_list = new ArrayList<>();
    public List<Integer> q_list = new ArrayList<>();
    public List<Integer> c_list = new ArrayList<>();
    public void ca_list() {
        p_list.forEach((p_all) -> {
           
            home.p_area.append(String.valueOf(p_all));
            home.p_area.append("\n");
        });
        q_list.forEach((q_all) -> {
         
            home.q_area.append(String.valueOf(q_all));
            home.q_area.append("\n");
        });
        c_list.forEach((c_all) -> {
         
            home.c_area.append(String.valueOf(c_all));
            home.c_area.append("\n");
        });
    }
        
    }
