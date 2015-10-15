
package studenthealthservice;



/**
 *
 * @author josephp
 */
public class StudentHealthService {
    public static void main(String[] args) {
        
        EMR joe = new EMR("Joe");
        joe.setDOB(51092);
        joe.setName("Joe");
        
        
        joe.reasonForVisit = "Sick";
        joe.vitals = "101 and 105";
        joe.setTemperature(101);
        joe.setRate(105);
        joe.meds = "Vitamin C";
        joe.diagnosis = "Health Care";
        System.out.println("Patient name is " + joe.getName() + " and date of birth is  " + joe.getDOB() + ". Reason for visit is that he is " + joe.reasonForVisit + " and has body temp and heart rate of "+ joe.getTemperature() + " and " + joe.getRate() + ". We will be giving him " + joe.meds);
        
        
        EMR jon = new EMR("Jon");
        jon.setDOB(11090);
        jon.setName("Jon");
        
        jon.reasonForVisit = "Sick";
        jon.diagnosis = "Health Care";
        jon.meds = "Cough Syrup";
        jon.vitals = "105 and 110";
        jon.setTemperature(105);
        jon.setRate(110);
        
        
        System.out.println("Patient name is " + jon.getName() + " and date of birth is  " + jon.getDOB() + ". Reason for visit is that he is " + jon.reasonForVisit + " and has body temp and heart rate of " + jon.getTemperature() + " and " + jon.getRate() + ". We will be giving him " + jon.meds);
        
        
                
        EMR aaron = new EMR("aaron");
        aaron.setName("aaron");
        aaron.setDOB(21492);
        
        aaron.reasonForVisit = "Broken arm";
        aaron.vitals = "99 and 100";
        aaron.setTemperature(99);
        aaron.setRate(100);
        aaron.diagnosis = "X-Ray";
        aaron.meds = "Cast";
       
        
        System.out.println("Patient name is " + aaron.getName() + " and date of birth is  " + aaron.getDOB() + ". Reason for visit is that he has a " + aaron.reasonForVisit + " and has body temp and heart rate of " + aaron.getTemperature() + " and " +aaron.getRate() +  ". We will be giving him a " + aaron.meds);
        
        EMR roy = new EMR("Roy");
        roy.setName("Roy");
        roy.setDOB(31595);
        
        roy.reasonForVisit = "Broken leg";
        roy.vitals = "98 and 100";
        roy.setTemperature(98);
        roy.setRate(100);
        roy.diagnosis = "X-Ray";
        roy.meds = "Cast";
        
        
        
        EMR gabe = new EMR("Gabe");
        gabe.setName("Name");
        gabe.setDOB(122592);
        
        gabe.vitals = "100 and 105";
        gabe.setTemperature(100);
        gabe.setRate(105);
        gabe.reasonForVisit = "Flu";
        gabe.meds = "medication";
        gabe.diagnosis = "X-ray and health check up";
        
        
    }
        
        
    }
    

