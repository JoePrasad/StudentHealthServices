
package studenthealthservice;


public class EMR {
    String patientName;
    int dateOfBirth;
    String reasonForVisit;
    private String Vitals;
    int bodyTemperature;
    int heartRate;
    String diagnosis;
    String meds;
    String vitals;
    String Name;
    int DOB;
    
    
    public int dOB(){
        return this.dateOfBirth;
    }
    
    public int Temperature() {
        return this.bodyTemperature;
    }
    public int Rate(){
        return this.heartRate;
    }
    public String name(){
        return this.patientName;
    }
    public String reason(){
        return this.reasonForVisit;
    }
    public String vitals(){
        return this.Vitals;
    }
    public String diagnosis(){
        return this.diagnosis;
    }
    public String medicine(){
        return this.meds;
    }
    
    public EMR(String name) {
        this.Name = name;
        
    }
    public String getName(){
        return Name;
    }
    
    public void setName (String name) {
        this.Name = name;
    }
    public int getDOB() {
        return DOB;
    }
    public void setDOB(int DOB) {
        this.DOB = DOB;
    }
    public int getTemperature(){
        return bodyTemperature;
    }
    
    public void setTemperature(int Temperature) {
        this.bodyTemperature = Temperature;
    }
    public int getRate() {
        return heartRate;
    }
    public void setRate(int heartRate) {
        this.heartRate = heartRate;
    }
    
    
    
    public EMR RedFlags(EMR c1) {
        if(this.heartRate > 60) {
            return this;
        }else{
            return c1;
        }
    }
    
        public EMR redFlags (EMR c2) {
        if(this.bodyTemperature > 97.3) {
            return this;
        }else{
            return c2;
        }
    }
    
    
    
}




