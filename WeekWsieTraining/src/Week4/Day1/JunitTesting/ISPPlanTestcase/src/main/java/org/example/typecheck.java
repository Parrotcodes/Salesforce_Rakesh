package org.example;

import java.util.Comparator;

//Sort by Type (alphabetical order: "2G", "4G", "5G")
public class typecheck implements Comparator<ISPPlans> {
 @Override
 public int compare(ISPPlans t1, ISPPlans t2) {
     return t1.getType().compareTo(t2.getType());
 }
}
