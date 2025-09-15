package org.example;

import java.util.Comparator;


//Sort by Plan Name (alphabetical order)
public class namesort implements Comparator<ISPPlans> {
 @Override
 public int compare(ISPPlans n1, ISPPlans n2) {
     return n1.getName().compareTo(n2.getName());
 }
}
