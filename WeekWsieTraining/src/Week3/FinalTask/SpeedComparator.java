package Week3.FinalTask;

import java.util.Comparator;


class SpeedComparator implements Comparator<ISPPlans> {
    @Override
    public int compare(ISPPlans speed1, ISPPlans speed2) {
        return Integer.compare(speed1.getSpeed(),speed2.getSpeed()); //integer class by default implents comaprable
    }
}

