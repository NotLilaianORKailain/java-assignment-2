

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343479150
 */
public class Verdict {
    // all declared var from UML
    private String caseName;
    private String studentVerdict;
    private String reason;
    
    //newly added var for static method requirment
    private static int unethicalCount = 0;
    
    // default no input constructor of each verdict object
    public Verdict() {
        this.caseName = "DEFAULT_CASE";
        this.reason = "DEFAULT_REASON";
        this.studentVerdict = "DEFAULT_VERDICT";
    }
    
    // constructor of each verdict object
    public Verdict (String caseName, String verdict, String reason) {
        this.caseName = caseName;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    
    // METHOD: tracks number of times user picks unethical
    public static void addUnethical() {
        unethicalCount++;
    }
    
    // METHOD: setter method
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public void setStudentVerdict(String studentVerdict) {
        this.studentVerdict = studentVerdict;
    }
    
    // METHODS: getter method
    public String getCaseName() {
      return caseName;
    }
    public String getReason() {
        return reason;
    }
    public String getStudentVerdict() {
        return studentVerdict;
    }
    public static int getUnethicalCount() {
        return unethicalCount;
    }
    
    @Override
    /** TOSTRING: returns all details regarding a verdict
     * @return String 
     */
    public String toString() {
        return "Case name: " + caseName + "Reason: " + reason + "Verdict: " + studentVerdict;
    }
}
