/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343479150
 */
public class Verdict {
    //Variable declaration
    private String caseName;
    private String studentVerdict;
    private String reason;
    
    /** a constructor
     * 
     */
    public Verdict() {
        this.caseName = "idk";
        this.reason = "idk again";
        this.studentVerdict = "still dunno";
    }
    
    /** another constructor
     * 
     * @param caseName
     * @param verdict
     * @param reason 
     */
    public Verdict (String caseName, String verdict, String reason) {
        this.caseName = caseName;
        this.studentVerdict = verdict;
        this.reason = reason;
    }
    
    /**
     * 
     */
    public void setCaseName() {
    this.caseName = caseName;
    }
    
    /**
     * 
     * @return String caseName
     */
    public String getCaseName() {
      return caseName;
    }
    
    /**
     * 
     */
    public void setReason() {
        this.reason = reason;
    }
    
    /**
     * 
     * @return String reason
     */
    public String getReason() {
        return reason;
    }
    
    /**
     * 
     */
    public void setStudentVerdict() {
        this.studentVerdict = studentVerdict;
    }
    
    /**
     * 
     * @return String studentVerdict
     */
    public String getStudentVerdict() {
        return studentVerdict;
    }
    
    /**
     * 
     * @return case name, reason, and verdict
     */
    public String toString() {
        return "Case name: " + caseName + "Reason: " + reason + "Verdict: " + studentVerdict;
    }
}
