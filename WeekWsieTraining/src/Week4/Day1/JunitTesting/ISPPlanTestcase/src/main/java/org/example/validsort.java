package org.example;

import java.util.Comparator;

//Sort by Validity (low → high)
public class validsort implements Comparator<ISPPlans> {
 @Override
 public int compare(ISPPlans v1, ISPPlans v2) {
     return Integer.compare(v1.getValidity(), v2.getValidity());
 }
}