package org.example;

import java.util.Comparator;


//Sort by Speed (low → high)
public class sppedsort implements Comparator<ISPPlans> {
 @Override
 public int compare(ISPPlans s1, ISPPlans s2) {
     return Integer.compare(s1.getSpeed(), s2.getSpeed());
 }
}
