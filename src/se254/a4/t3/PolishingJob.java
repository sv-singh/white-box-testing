package se254.a4.t3;

/**
 * This class represents a polishing job
 * 
 * @author Author Name: Saurabh Singh, Author UPI: ssin610
 * @version Date: 28/10/2020 
 * 
 * The polishingRent method now calls the parent getRent method.
 * This fixes the previous code duplication present in this class and
 * in CleaningJob, as now the duplicated code is in a single method
 * getRent in the parent class Job
 *
 */

public class PolishingJob extends Job{
	double polishingRent(Floor floor, PolishingMachine polisher) {
		return getRent(floor, polisher);
	}
}